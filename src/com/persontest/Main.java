package com.persontest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main {

    @Test
    public void func(){
        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloworld());
    }
}
