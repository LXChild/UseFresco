package com.example;
//
//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class MyClass {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数据组数：");
//        int T = sc.nextInt();
//
//        while (T-- > 0) {
//            System.out.println("请输入数据n：");
//            int n = sc.nextInt();
//            //int[] queue_out = getOrigin(n);
//            LinkedList<Integer> queue_out = getOrigin(n);
//
//            System.out.println("原始数据为n：");
//            System.out.println(" " + queue_out.size());
//            for (int i = 0; i < n; i++) {
//                System.out.print(queue_out.removeLast() + " ");
//            }
//        }
//    }
//
//    private static LinkedList<Integer> getOrigin(int n) {
//        LinkedList<Integer> queue_in = new LinkedList<>();
////        int[] out= new int[n];
////        for (int i = 1; i <= n; i++) {
////            queue_in.offer(n);
////        }
////        int h = n / 2;
////        for (int i = 0; i < queue_in.size(); i++) {
////            out[i] = queue_in.remove();
////            queue_in.remove(i);
////        }
//        for(int i=n;i>0;i--){
//            queue_in.add(i);
////            int temp=queue_in.removeFirst();
////            queue_in.add(temp);
//        }
//
////        for (int i = h; i < n; i++) {
////            if (out[(2 * i + 1) % (n - 1)] != 0) {
////                out[(2 * i + 1) % (n - 1)] = queue_in.poll();
////            } else {
////                out[((2 * i + 1) % (n - 1)) + 1] = queue_in.poll();
////            }
////        }for(int i=list.size()-1;i>0;i--){
//
//        return queue_in;
//    }
//
//    /**
//     * 网易内推面试题一
//     * */
//    /*public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //获取输入的数据组数
//        System.out.println("请输入数据组数：");
//        int T = Integer.parseInt(sc.nextLine());
//
//        while(T-- > 0) {
//            System.out.println("请输入数据大小的一半和洗牌次数：");
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//
//            int[] data = new int[2 * n];
//            System.out.println("请输入原始牌组从上到下的序列（中间用空格隔开）：");
//            for (int i = 0; i < 2*n; i++) {
//                data[i] = sc.nextInt();
//            }
//
//            int[] data_new = data;
//            for (int i = 0; i < k; i++) {
//                data_new = shuffle(data_new, n);
//            }
//            System.out.println("反转结果为：");
//            for (int i = 0; i < data_new.length; i++) {
//                System.out.print(data_new[i]);
//                if (i != data_new.length - 1) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }*/
//
//    /*private static int[] shuffle(int[] data, int n) {
//        System.out.println("输入数据大小一半为：" + n);
//        System.out.print("输入数据为：");
//        for (int i : data) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        int[] g1 = new int[n];
//        int[] g2 = new int[n];
//        for (int i = 0; i < n; i++) {
//            g1[i] = data[i];
//            g2[i] = data[n + i];
//        }
//        System.out.print("输入数据g1为：");
//        for (int i : g1) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        System.out.print("输入数据g2为：");
//        for (int i : g2) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        int[] data_new = new int[2 * n];
//        for (int i = n - 1; i >= 0; i--) {
//            System.out.println(">>>>>>>>>>>>>>" + i);
//            data_new[2 * i + 1] = g2[i];
//            data_new[2 * i] = g1[i];
//        }
//        System.out.print("输出数据为：");
//        for (int i : data_new) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        return data_new;
//    }*/
//}
//
//import java.util.Scanner;
//
//
//import java.util.*;
//
//public class MyClass {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        //输入价签的数量以及小B的购买清单中所列的物品数
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        if (n < 1) {
//            return;
//        }
//        if (m > 1000) {
//            return;
//        }
//
//        int[] n_p = new int[n];
//        for (int i = 0; i < n; i++) {
//            n_p[i] = sc.nextInt();
//        }
//        sc.nextLine();
//        String[] m_a = new String[m];
//        for (int i = 0; i < m; i++) {
//            m_a[i] = sc.nextLine();
//        }
//        int count = 0;
//        for (int i = 0; i < m_a.length; i++) {
//            for (int j = (i + 1); j < m_a.length; j++) {
//                if(m_a[i].equals(m_a[j])) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(CalculateMin(n_p, m, count) + " " + CalculateMax(n_p, m, count));
//    }
//
//    private static int CalculateMin(int[] arr, int m,int count) {
//        Arrays.sort(arr);
//        int result = 0;
//        if (count == 0) {
//            for (int i = 0; i < m; i++) {
//                result += arr[i];
//            }
//        } else {
//            for (int i = 0; i < (m - count); i++) {
//                result += arr[i];
//            }
//            for (int i = 0; i < count; i++) {
//                result += arr[0];
//            }
//        }
//        return result;
//    }
//    private static int CalculateMax(int[] arr, int m,int count) {
//        Arrays.sort(arr);
//        int result = 0;
//        if (count == 0) {
//            for (int i = 0; i < m; i++) {
//                result += arr[arr.length - i - 1];
//            }
//        } else {
//            for (int i = 0; i < (m - count); i++) {
//                result += arr[arr.length - i - 1];
//            }
//            for (int i = 0; i < count; i++) {
//                result += arr[arr.length - 1];
//            }
//        }
//        return result;
//    }
////}
//import java.util.*;
//public class MyClass {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String color = sc.nextLine();
//        String f_color = sc.nextLine();
//        String s_color = sc.nextLine();
//        System.out.println(getDir(color, f_color, s_color));
//    }
//    private static String getDir(String color, String f_color, String s_color) {
//        if (!color.contains(f_color) || !color.contains(s_color)) {
//            return "invalid";
//        }
//        int index = color.indexOf(f_color);
//        String temp = color.substring(index);
//        if (temp.contains(s_color)) {
//            int index2 = color.indexOf(s_color);
//            String temp2 = color.substring(index2);
//            if (temp2.contains(f_color)) {
//                return "both";
//            } else {
//                return "forward";
//            }
//        } else {
//            return "backward";
//        }
//    }
//}
import java.util.*;
public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println((Rev(x) + Rev(y)) + "");
    }

    private static int Rev(int x) {
        String str = x + "";
        return Integer.parseInt(new StringBuilder(str).reverse().toString());
    }
}