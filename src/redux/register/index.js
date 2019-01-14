// vendor
import { all, call, put, take } from 'redux-saga/effects';
import { replace } from 'connected-react-router';
import md5 from 'md5';

// proj
import { book } from '../../routes';
import { fetchAPI } from '../../utils';

/**
 * Constants
 **/
export const moduleName = 'register';
const prefix = `codenjoy/${moduleName}`;

export const REGISTER = `${prefix}/REGISTER`;
export const REGISTER_SUCCESS = `${prefix}/REGISTER_SUCCESS`;
export const REGISTER_FAIL = `${prefix}/REGISTER_FAIL`;

/**
 * Reducer
 **/
const ReducerState = {
    registerErrors: void 0,
};

export default function reducer(state = ReducerState, action) {
    const { type, payload } = action;

    switch (type) {
        case REGISTER:
            return { ...state, registerErrors: void 0 };

        case REGISTER_SUCCESS:
            return { ...state, registerErrors: void 0 };

        case REGISTER_FAIL:
            return { ...state, registerErrors: payload };

        default:
            return state;
    }
}

/**
 * Action Creators
 **/

export const register = payload => ({
    type: REGISTER,
    payload,
});

export const registerSuccess = () => ({
    type: REGISTER_SUCCESS,
});

export const registerFail = errors => ({
    type:    REGISTER_FAIL,
    payload: errors,
});

/**
 * Saga
 **/

export function* registerFormSaga() {
    while (true) {
        const {
            payload: { password, ...restPayload },
        } = yield take(REGISTER);
        const payload = { ...restPayload, password: md5(password) };

        const response = yield call(
            fetchAPI,
            'POST',
            'rest/register',
            null,
            payload,
            { noRedirect: true },
        );
        if (response instanceof Error) {
            const failParams =
                response.status === 400
                    ? { credentials: true }
                    : { system: true };

            yield put(registerFail(failParams));
        } else {
            if (!response.code) {
                yield put(registerFail({ credentials: true }));
            } else {
                yield put(registerSuccess());
                yield put(replace(book.login));
            }
        }
    }
}

export function* saga() {
    yield all([ call(registerFormSaga) ]);
}
