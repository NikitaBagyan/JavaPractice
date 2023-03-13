package Kata;

import java.io.*;
import java.nio.charset.Charset;


public class ErrorChecking {
    public static void main(String[] args) {
        class A extends java.lang.Exception{}
        class B extends A{}
        class C extends B{}
        class D extends A{}
        class E extends A{}
        class F extends D{}
        class G extends D{}
        class H extends E{}


    }
}