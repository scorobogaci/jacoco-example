package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingsBuilderTest {

    @Test
    public void testGreetingEN() {
        GreetingsBuilder greetingsBuilder = new GreetingsBuilder("EN");
        String greeting = greetingsBuilder.greet();
        assertEquals("Hello", greeting);
    }

    @Test
    public void testGreetingFR() {
        GreetingsBuilder greetingsBuilder = new GreetingsBuilder("FR");
        String greeting = greetingsBuilder.greet();
        assertEquals("Bonjour", greeting);
    }

    @Test
    public void testGreetingDE() {
        GreetingsBuilder greetingsBuilder = new GreetingsBuilder("DE");
        String greeting = greetingsBuilder.greet();
        assertEquals("Hallo", greeting);
    }

    @Test
    public void testGreetingDefault() {
        GreetingsBuilder greetingsBuilder = new GreetingsBuilder("TR");
        String greeting = greetingsBuilder.greet();
        assertEquals("Sorry language not supported", greeting);
    }
}