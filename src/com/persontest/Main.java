package com.persontest;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class Main {


    @Test
    public void func(){
        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloworld());
    }

    @Test
    public void shouldReturnPerson(){
        Person person = new Person();
        assertEquals("Good Marcus", person.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberOfPerson(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        assertEquals(2, person2.numberOfPersona());
    }


}
