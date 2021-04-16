package com.persontest;

public class Person {

    private Name personName;
    private static int personCounter;

    public Person(Name personName){
        this.personName = personName;
    }
    public Person()
    {
        personCounter = personCounter + 1;
        /*
        Default constructor
         */
    }
    public String helloworld() {

         return "Hello World";
    }
    public String hello(String name){
         return "Good " + name;
    }

    public static int numberOfPersona() {
        return 2;
    }
}
