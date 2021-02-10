//Programmer: Marhella Abreu Rosario
//Date: Feb 7, 2021
//Description: This is a recursive method to find the nth term of the fibonacci sequence
//using user input.

import java.util.Scanner;

public class Main
{


    public static void main (String[] args) {



        //Declare scanner
        Scanner sc = new Scanner(System.in);

        //Print out message to user to input number
        System.out.println("Which fibonacci number do you want?");


        int next = sc.nextInt();

        //start timer
        long start = System.currentTimeMillis();


        //Call on fibonacci method to return nth number, print results
        System.out.println("The "+next+"th fibonacci number is:" + fibonacci(next));

        //stop timer
        long end = System.currentTimeMillis();

        //print time elapsed
        System.out.println("\n" +
                "Time: " + (end - start));
    }

           public static int fibonacci(int number){

            //this makes sure that our base cases are taken care of
               //this assumes that the first number in the fib sequence is 0 not 1


            if (number ==0)
                return 0;

            else if (number == 1)
                return 0;

            else if (number ==2)
                return 1;


            //number in fibonacci is the sum of the 2 numbers before it
            else {
                return (fibonacci(number - 1) + fibonacci(number - 2));
            }


        }
        }


