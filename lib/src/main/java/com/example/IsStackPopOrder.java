package com.example;

import java.util.Stack;

/**
 * Created by LXChild on 10/1/16.
 */

public class IsStackPopOrder {

    public static void init() {
        Stack<Integer> origin = new Stack<>();
        for (int i = 5; i > 0; i--) {
            origin.push(i);
        }
        int[] order = {4, 5, 3, 2, 1};
        Stack<Integer> s = null;
        System.out.println(isOrder(s, origin, order));
    }

    private static boolean isOrder(Stack<Integer> s, Stack<Integer> origin, int[] order) {
        assert s != null;
        assert  origin != null; assert origin.size() > 0;
        assert  order != null; assert order.length > 0;
        int i = 0;
        while (s.size() > 0 || origin.size() > 0) {
            if (s.size() > 0 && order[i] == s.peek()) {
                s.pop();
                i++;
            } else if (origin.size() > 0) {
                s.push(origin.pop());
            } else {
                break;
            }
        }

        return s.size() <= 0;
    }
}
