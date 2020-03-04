package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FizzTest
{
    private final Fizz fizz = new Fizz();

    @Test
    public void shouldAssert()
    {
        assertEquals( "Fizz", fizz.buzz(5));
    }
}
