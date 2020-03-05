package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class Fizz
{
    public String buzz(int argument) {
      if (argument % 5 == 0) {
        return "Fizz";
      } else {
        return "Wrong";
      }

    }

    public static void main( String[] args )
    {
      Fizz fizz = new Fizz();
    }
}
