package com.mycompany.app;

public class Fizz
{
    public String buzz(int number) {
      if (number % 5 == 0 && number % 3 == 0) {
        return "FizzBuzz";
      } else if (number % 5 == 0) {
        return "Fizz";
      } else if (number % 3 == 0) {
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
