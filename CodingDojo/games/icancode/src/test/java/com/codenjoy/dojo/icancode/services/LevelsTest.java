package com.codenjoy.dojo.icancode.services;

/*-
 * #%L
 * iCanCode - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2018 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.codenjoy.dojo.utils.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by oleksandr.baglai on 24.06.2016.
 */
public class LevelsTest {
    @Test
    public void testLevel1() {
        String map = getMap(Levels.LEVEL_1A);

        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "     ######     " +
                "     #S..E#     " +
                "     ######     " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "     ╔════┐     " +
                "     ║S..E│     " +
                "     └────┘     " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                ", decorate);
    }

    private String getMap(String level) {
        return Levels.resize(level, Levels.VIEW_SIZE_TESTING);
    }

    @Test
    public void testLevel2() {
        String map = getMap(Levels.LEVEL_1B);

        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "    ########    " +
                "    #S.....#    " +
                "    #..###.#    " +
                "    #..# #.#    " +
                "    #.$###.#    " +
                "    #......#    " +
                "    #..$..E#    " +
                "    ########    " +
                "                " +
                "                " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "    ╔══════┐    " +
                "    ║S.....│    " +
                "    ║..┌─╗.│    " +
                "    ║..│ ║.│    " +
                "    ║.$╚═╝.│    " +
                "    ║......│    " +
                "    ║..$..E│    " +
                "    └──────┘    " +
                "                " +
                "                " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testLevel3() {
        String map = getMap(Levels.LEVEL_2B);

        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "    ########    " +
                "    #S.O..$#    " +
                "    #......#    " +
                "    ####...#    " +
                "       #..O#    " +
                "    ####...#    " +
                "    #...O.E#    " +
                "    ########    " +
                "                " +
                "                " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "    ╔══════┐    " +
                "    ║S.O..$│    " +
                "    ║......│    " +
                "    └──╗...│    " +
                "       ║..O│    " +
                "    ╔══╝...│    " +
                "    ║...O.E│    " +
                "    └──────┘    " +
                "                " +
                "                " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testLevel4() {
        String map = getMap(Levels.LEVEL_3B);

        asrtMap("                " +
                "                " +
                "    #######     " +
                "    #S.O..#     " +
                "    ####..#     " +
                "       #..#     " +
                "    ####..###   " +
                "    #$B.OO..#   " +
                "    #.###...#   " +
                "    #.# #...#   " +
                "    #.###..E#   " +
                "    #.......#   " +
                "    #########   " +
                "                " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "    ╔═════┐     " +
                "    ║S.O..│     " +
                "    └──╗..│     " +
                "       ║..│     " +
                "    ╔══╝..╚═┐   " +
                "    ║$B.OO..│   " +
                "    ║.┌─╗...│   " +
                "    ║.│ ║...│   " +
                "    ║.╚═╝..E│   " +
                "    ║.......│   " +
                "    └───────┘   " +
                "                " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testLevel5() {
        String map = getMap(Levels.LEVEL_1C);

        asrtMap("                " +
                "                " +
                "    ########    " +
                "    #S...B.#    " +
                "    ###B...#    " +
                "      #B...#    " +
                "    ###$B..#### " +
                "    #$....B..B# " +
                "    #.#####...# " +
                "    #.#   #...# " +
                "    #.#####.B.# " +
                "    #.E.....B$# " +
                "    ########### " +
                "                " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "    ╔══════┐    " +
                "    ║S...B.│    " +
                "    └─╗B...│    " +
                "      ║B...│    " +
                "    ╔═╝$B..╚══┐ " +
                "    ║$....B..B│ " +
                "    ║.┌───╗...│ " +
                "    ║.│   ║...│ " +
                "    ║.╚═══╝.B.│ " +
                "    ║.E.....B$│ " +
                "    └─────────┘ " +
                "                " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testLevel6() {
        String map = getMap(Levels.LEVEL_1D);

        asrtMap("                " +
                "  #####         " +
                "  #S..#         " +
                "  #..B#######   " +
                "  #B..B˃...$#   " +
                "  ###....BBB#   " +
                "    #.B....$#   " +
                "    #...˄B..### " +
                "    #.###˃....# " +
                "    #.# #B.B.$# " +
                "    #.# #...### " +
                "    #.# #.$##   " +
                "    #E# ####    " +
                "    ###         " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "  ╔═══┐         " +
                "  ║S..│         " +
                "  ║..B╚═════┐   " +
                "  ║B..B˃...$│   " +
                "  └─╗....BBB│   " +
                "    ║.B....$│   " +
                "    ║...˄B..╚═┐ " +
                "    ║.┌─╗˃....│ " +
                "    ║.│ ║B.B.$│ " +
                "    ║.│ ║...┌─┘ " +
                "    ║.│ ║.$┌┘   " +
                "    ║E│ └──┘    " +
                "    └─┘         " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testDemoLevel() {
        String map = getMap(Levels.DEMO_LEVEL);

        asrtMap("                " +
                " ############## " +
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                " ╔════════════┐ " +
                " ║S...O.....˅.│ " +
                " ║˃.....$O....│ " +
                " ║....┌──╗....│ " +
                " ║....│  ║....│ " +
                " ║.O┌─┘  └─╗.O│ " +
                " ║.$│      ║..│ " +
                " ║..│      ║$.│ " +
                " ║O.╚═┐  ╔═╝O.│ " +
                " ║....│  ║....│ " +
                " ║....╚══╝....│ " +
                " ║....O$.....˂│ " +
                " ║.˄.....O...E│ " +
                " └────────────┘ " +
                "                ", decorate);
    }

    @Test
    public void testLevel13() {
        String map = getMap(Levels.LEVEL_9A);

        asrtMap("                " +
                "                " +
                "                " +
                "  ############  " +
                "  #..........#  " +
                "  #.########.#  " +
                "  #.#      #.#  " +
                "  #.# #### #.#  " +
                "  #.# #.S# #.#  " +
                "  #.# #.## #.#  " +
                "  #.# #.#  #.#  " +
                "  #.# #.####.#  " +
                "  #E# #......#  " +
                "  ### ########  " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "                " +
                "  ╔══════════┐  " +
                "  ║..........│  " +
                "  ║.┌──────╗.│  " +
                "  ║.│      ║.│  " +
                "  ║.│ ╔══┐ ║.│  " +
                "  ║.│ ║.S│ ║.│  " +
                "  ║.│ ║.┌┘ ║.│  " +
                "  ║.│ ║.│  ║.│  " +
                "  ║.│ ║.╚══╝.│  " +
                "  ║E│ ║......│  " +
                "  └─┘ └──────┘  " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testMultiLevelSimple() {
        String map = getMap(Levels.MULTI_LEVEL_SIMPLE);

        asrtMap("    ############### " +
                "    #˃.........$.˅# " +
                "    #B.O.O###B.S..# " +
                "  ###.B.B.# #.....# " +
                "  #.$.S...# #B.$..# " +
                "  #...B#### ##.O..# " +
                "  #.O..#     ###..# " +
                "  #..$.#####   #..# " +
                "  #BB....˅.#####..# " +
                "  ######..........# " +
                "       ##..E.###### " +
                " #####  #....#      " +
                " #.$.#  #.$.B###### " +
                " #...####.......O.# " +
                " #˃.......####B.$.# " +
                " ####B.$..#  ###### " +
                "    #.S...#         " +
                " ####..O.B########  " +
                " #B...O$........˂#  " +
                " #################  ", map);

        String decorate = Levels.decorate(map);

        asrtMap("    ╔═════════════┐ " +
                "    ║˃.........$.˅│ " +
                "    ║B.O.O┌─╗B.S..│ " +
                "  ╔═╝.B.B.│ ║.....│ " +
                "  ║.$.S...│ ║B.$..│ " +
                "  ║...B┌──┘ └╗.O..│ " +
                "  ║.O..│     └─╗..│ " +
                "  ║..$.╚═══┐   ║..│ " +
                "  ║BB....˅.╚═══╝..│ " +
                "  └────╗..........│ " +
                "       └╗..E.┌────┘ " +
                " ╔═══┐  ║....│      " +
                " ║.$.│  ║.$.B╚════┐ " +
                " ║...╚══╝.......O.│ " +
                " ║˃.......┌──╗B.$.│ " +
                " └──╗B.$..│  └────┘ " +
                "    ║.S...│         " +
                " ╔══╝..O.B╚══════┐  " +
                " ║B...O$........˂│  " +
                " └───────────────┘  ", decorate);
    }

    @Test
    public void testMultiLevel() {
        String map = getMap(Levels.MULTI_LEVEL);

        asrtMap("                                      " +
                "   ######      ###########            " +
                "   #$..˅#      #˃.....$..#            " +
                "   #BB.O#      #.........# ########   " +
                "   #B...#      #...B.BBBB# #˃.O..O#   " +
                "   #..O.#  #####˃...$...O# #..$.BB#   " +
                "   #˃...####......O......# #O...O˂#   " +
                "   #..$......###....$..OO# #O....B#   " +
                "   #B...###### #.O.......# #B.#####   " +
                "   #B..O#      #.........###B.#       " +
                "   ##.### ######..BOO.........#       " +
                "    #.#   #..$..B.B....B.B..BB#       " +
                "    #.#   #$..###.B.#######B.B###     " +
                "    #.#   #...# #BB.#     #O..BB#     " +
                "    #.#   ##### #...#     #.$..˂#     " +
                "   ##.###       #.B.#  ####.....#     " +
                "   #..B.#  ######.BB#  #....BO.$#     " +
                "   #...$#  #B.......####.BB.B...#     " +
                "   #O...####O...O...$....######.#     " +
                "   #..O.........S..O######    #.##### " +
                "   #˄...####.OB.E...#       ###.B...# " +
                "   #BB..#  #BBB....˄#  ######˃....$.# " +
                "   ###.##  #˃..O..$O#  #˃......$....# " +
                "     #.#   #####.####  ######˃......# " +
                " #####.###     #.#          #####..O# " +
                " #..O...˂#  ####.##########     #.O.# " +
                " #....O..#  #......$..B.BB#     #O..# " +
                " #$#######  #.#####.BB..BB#######.### " +
                " #.#        #.#   #....O..........#   " +
                " #.# ########.##  ####....#####.B##   " +
                " #.# #.....˂...##### ###.##   #..#    " +
                " #.# #B.O....O..$..#   #.#    #B.#### " +
                " #.###..O.$....###.#####.#### #.$...# " +
                " #.$....O..O.BB# #.BB˃...O..# #....˂# " +
                " #.#####BB.BBBB# #.....$....# #..B..# " +
                " #˄#   #.$....˂# ####.BO..OB# #˃....# " +
                " ###   #...$...#    ######### #...B.# " +
                "       #########              ####### ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                                      " +
                "   ╔════┐      ╔═════════┐            " +
                "   ║$..˅│      ║˃.....$..│            " +
                "   ║BB.O│      ║.........│ ╔══════┐   " +
                "   ║B...│      ║...B.BBBB│ ║˃.O..O│   " +
                "   ║..O.│  ╔═══╝˃...$...O│ ║..$.BB│   " +
                "   ║˃...╚══╝......O......│ ║O...O˂│   " +
                "   ║..$......┌─╗....$..OO│ ║O....B│   " +
                "   ║B...┌────┘ ║.O.......│ ║B.┌───┘   " +
                "   ║B..O│      ║.........╚═╝B.│       " +
                "   └╗.┌─┘ ╔════╝..BOO.........│       " +
                "    ║.│   ║..$..B.B....B.B..BB│       " +
                "    ║.│   ║$..┌─╗.B.┌─────╗B.B╚═┐     " +
                "    ║.│   ║...│ ║BB.│     ║O..BB│     " +
                "    ║.│   └───┘ ║...│     ║.$..˂│     " +
                "   ╔╝.╚═┐       ║.B.│  ╔══╝.....│     " +
                "   ║..B.│  ╔════╝.BB│  ║....BO.$│     " +
                "   ║...$│  ║B.......╚══╝.BB.B...│     " +
                "   ║O...╚══╝O...O...$....┌────╗.│     " +
                "   ║..O.........S..O┌────┘    ║.╚═══┐ " +
                "   ║˄...┌──╗.OB.E...│       ╔═╝.B...│ " +
                "   ║BB..│  ║BBB....˄│  ╔════╝˃....$.│ " +
                "   └─╗.┌┘  ║˃..O..$O│  ║˃......$....│ " +
                "     ║.│   └───╗.┌──┘  └────╗˃......│ " +
                " ╔═══╝.╚═┐     ║.│          └───╗..O│ " +
                " ║..O...˂│  ╔══╝.╚════════┐     ║.O.│ " +
                " ║....O..│  ║......$..B.BB│     ║O..│ " +
                " ║$┌─────┘  ║.┌───╗.BB..BB╚═════╝.┌─┘ " +
                " ║.│        ║.│   ║....O..........│   " +
                " ║.│ ╔══════╝.╚┐  ║┌─╗....┌───╗.B┌┘   " +
                " ║.│ ║.....˂...╚══╝│ └─╗.┌┘   ║..│    " +
                " ║.│ ║B.O....O..$..│   ║.│    ║B.╚══┐ " +
                " ║.╚═╝..O.$....┌─╗.╚═══╝.╚══┐ ║.$...│ " +
                " ║.$....O..O.BB│ ║.BB˃...O..│ ║....˂│ " +
                " ║.┌───╗BB.BBBB│ ║.....$....│ ║..B..│ " +
                " ║˄│   ║.$....˂│ └──╗.BO..OB│ ║˃....│ " +
                " └─┘   ║...$...│    └───────┘ ║...B.│ " +
                "       └───────┘              └─────┘ ", decorate);
    }

    private void asrtMap(String expected, String actual) {
        assertEquals(TestUtils.injectN(expected),
                TestUtils.injectN(actual));
    }

    @Test
    public void testResizeLevel_increase() {
        String input =
                "                " +
                " ############## " +
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ";

        String resized = Levels.resize(input, 20);

        asrtMap("                    " +
                "                    " +
                "                    " +
                "   ##############   " +
                "   #S...O.....˅.#   " +
                "   #˃.....$O....#   " +
                "   #....####....#   " +
                "   #....#  #....#   " +
                "   #.O###  ###.O#   " +
                "   #.$#      #..#   " +
                "   #..#      #$.#   " +
                "   #O.###  ###O.#   " +
                "   #....#  #....#   " +
                "   #....####....#   " +
                "   #....O$.....˂#   " +
                "   #.˄.....O...E#   " +
                "   ##############   " +
                "                    " +
                "                    " +
                "                    ", resized);
    }

    @Test
    public void testResizeLevel_increaseNonOdd() {
        String input =
                "                " +
                " ############## " +
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ";

        String resized = Levels.resize(input, 17);

        asrtMap("                 " +
                " ##############  " +
                " #S...O.....˅.#  " +
                " #˃.....$O....#  " +
                " #....####....#  " +
                " #....#  #....#  " +
                " #.O###  ###.O#  " +
                " #.$#      #..#  " +
                " #..#      #$.#  " +
                " #O.###  ###O.#  " +
                " #....#  #....#  " +
                " #....####....#  " +
                " #....O$.....˂#  " +
                " #.˄.....O...E#  " +
                " ##############  " +
                "                 " +
                "                 ", resized);
    }

    @Test
    public void testResizeLevel_sameLength() {
        String input =
                "                " +
                " ############## " +
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ";

        String resized = Levels.resize(input, 16);

        asrtMap("                " +
                " ############## " +
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ", resized);
    }

    @Test
    public void testResizeLevel_lessThanNeeded() {
        String input =
                "                " +
                " ############## " +
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ";

        String resized = Levels.resize(input, 10);

        asrtMap("                " +
                " ############## " +
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ", resized);
    }
}