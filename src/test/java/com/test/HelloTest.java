package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HelloTest {
    @Test
    public void testSayHello() {
        Hello hello = new Hello();
        assertEquals("Hello Junit Test", hello.sayHello());


    }

    @Test
    public void testSayBye() {
        Hello hello = new Hello();
        assertEquals("Hello ByeJunit Test", hello.sayBye());
    }

    @Test
    public void testSayTaTa() {
        Hello hello = new Hello();
        assertEquals("TaTa Junit Test", hello.sayTaTa());
    }


    @Test
    public void testSayGoodBye() {
        Hello hello = new Hello();
        assertEquals("GoodBye Junit Test", hello.sayGoodBye());
    }

    @Test
    public void testSayGoodMorning() {
        Hello hello = new Hello();
        assertEquals("GoodMorning Junit Test", hello.sayGoodMorning());


    }
}
