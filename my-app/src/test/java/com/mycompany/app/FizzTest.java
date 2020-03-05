package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FizzTest
{
    private final Fizz fizz = new Fizz();

    @Test
    public void shouldAssertFizzFive()
    {
        assertEquals( "Fizz", fizz.buzz(5));
    }

    @Test
    public void shouldAssertFizzTen()
    {
        assertEquals( "Fizz", fizz.buzz(10));
    }

    @Test
    public void shouldAssertWrong()
    {
        assertEquals( "Wrong", fizz.buzz(1));
    }
}
