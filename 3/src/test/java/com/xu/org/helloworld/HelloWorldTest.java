package com.xu.org.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest{

    @Test
    public void testSay(){
        HelloWorld helloWorld=new HelloWorld();

        String r=helloWorld.say();

        assertEquals("Heelo Maven", r);
    }
}