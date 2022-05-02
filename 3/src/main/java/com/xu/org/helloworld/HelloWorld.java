package com.xu.org.helloworld;

public class HelloWorld {
    public String say() {
        return "hello Maven";
    }

    public static void main(String[] args) {
        
        System.out.println(new HelloWorld().say());

    }
}