package com.example;

import java.awt.Point;

/**
 * Created by LXChild on 10/10/2016.
 */

public final class HasPath {

    public static void init() {
        char[][] map = {{'a', 'b', 'c', 'e'},
                {'s', 'f', 'c', 's'},
                {'a', 'd', 'e', 'e'},};
        if (find(map, new char[]{'b', 'c', 'c', 'e', 'e'})) {
            System.out.println("Hash Path>>>>>>>>>>>>>>>>>>>>>>");
        } else {
            System.out.println("No Path>>>>>>>>>>>>>>>>>>>>>>");
        }

    }

    public static boolean find(char[][] map, char[] path) {
        if (map == null || map.length < 1 || map[0].length < 1
                || path == null || path.length < 1) {
            return false;
        }
        Point start = null;
        for (int i = 0; i < map.length; i ++) {
            for (int j = 0; j < map[i].length; j ++) {
                if (map[i][j] == path[0]) {
                    start = new Point(j, i);
                }
            }
        }
        if (start == null) {
            return false;
        }
        int node = 1;
        while (node < path.length) {

            if (start.getX() - 1 >= 0
                    && map[(int)start.getY()][(int)start.getX() - 1] == path[node]) {
                start.setLocation(start.getX() - 1, start.getY());
                node ++;
            } else if (start.getX() + 1 < map[0].length
                    && map[(int)start.getY()][(int)start.getX() + 1] == path[node]) {
                start.setLocation(start.getX() + 1, start.getY());
                node ++;
            } else if (start.getY() + 1 < map.length
                    && map[(int)start.getY() + 1][(int)start.getX()] == path[node]) {
                start.setLocation(start.getX(), start.getY() + 1);
                node ++;
            } else if (start.getY() - 1 >= 0
                    && map[(int)start.getY() - 1][(int)start.getX()] == path[node]) {
                start.setLocation(start.getX(), start.getY() - 1);
                node ++;
            } else {
                return false;
            }
        }
        return true;
    }
}
