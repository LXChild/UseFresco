package com.example;

/**
 * Created by LXChild on 9/24/16.
 */
/**
 * 单例模式,适用于多线程
 * */
public final class Singleton {
    private Singleton() {}
    public int a = 8;
    private static Singleton instance;
    public static Singleton getSingleton() {
        if (instance == null) {
            synchronized ("key") {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
