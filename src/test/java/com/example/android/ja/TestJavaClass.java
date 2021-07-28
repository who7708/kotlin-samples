package com.example.android.ja;

import com.example.android.kt.Foo;

/**
 * Created on 2021/07/28
 *
 * @author Chris
 * @version 1.0.0
 * @since 1.0.0
 */
public class TestJavaClass {
    public static void main(String[] args) {
        synchronized (TestJavaClass.class) {
            System.out.println("hello world");
        }

        System.out.println(Foo.answer);
        System.out.println(Foo.answer);

        Foo.sayHello();
    }
}
