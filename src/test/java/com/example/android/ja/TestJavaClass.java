package com.example.android.ja;

import com.example.android.kt.Foo;

/**
 * @author Chris
 * @version 1.0.0
 * @date 2021/05/14
 */
public class TestJavaClass {
    public static void main(String[] args) {
        synchronized (TestJavaClass.class) {
            System.out.println("hello world");
        }

        int a = 1 / 0;

        System.out.println(Foo.answer);

        Foo.sayHello();
    }
}
