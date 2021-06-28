package com.example.demo.model;

import com.example.demo.api.PersonController;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getNameTest() {
        //given
        String name = "Jack";

        //when
        Person myPerson = new Person(UUID.randomUUID(), name);

        //then
        assertEquals(myPerson.getName(),name);
    }

}