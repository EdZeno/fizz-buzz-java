package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class Fizz
{
    public String buzz(int argument) {
      if (argument % 5 == 0 && argument % 3 == 0) {
        return "FizzBuzz";
      } else if (argument % 5 == 0) {
        return "Fizz";
      } else if (argument % 3 == 0) {
        return "Buzz";
      } else {
        return "Wrong";
      }

    }

    public static void main( String[] args )
    {
      Fizz fizz = new Fizz();
    }
}
