package com.persontest;

import org.junit.Test;

import static com.persontest.Mobile.*;
import static org.junit.Assert.assertEquals;

public class Main<state>{

    //static final String[] MY_STATE_VALUES ={"PENDING", "PROCESSING", "PROCESSED"};

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
/*
    @Test
    public void shouldReturnNumberOfPerson(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        assertEquals(2, person2.numberOfPersons());
    }
*/
    @Test
    public void shouldReturnNumberOfPersonInLoop(){
        Person person1;
        int i =0;
        while (i < 4){
            person1 = new Person();
            i++;
        }
        assertEquals(4, Person.numberOfPersons());}
        /*
        for(int i =0;i <4 ;i++){
            person1 = new Person();
        }
        assertEquals(4, Person.numberOfPersons());
    }
*/
    @Test
    public void demonstrateBoolean(){
        int i =4;
        int j =3;
        boolean areEqual = i==j;
        if(i >j){
            j = 10;
        }else if (j > i){

        } else if (areEqual) {
            i =9;
        }else{
            j++;
        }
        }

        Mobile m = APPLE;

        switch(m){
            case APPLE:
               callAMethod();
               break;
            case SAMSUNG:
               callAMethod()
               break;
            case SONY:
               callAMethod()
               break;
}

    private void callAMethod() {
    }
/*
        for(LoggingLevel state:LoggingLevel.values()){

            if(state.equals("PENDING")){
                callAMethod(); }
        if(state.equals("PROCESSING")){
            callAMethod();
        }
        if(state.equals("PROCESSING")){
        callAMethod();
        }*/
}