//Programmer: Marhella
//Date: Feb 7, 2021
//Description: Using a for loop to implement an iterative function that prints out fibonacci sequence
import java.util.Scanner;

public class Main {

    public static void main (String[] arg){


        //declare variable + scanner
        Scanner sc = new Scanner(System.in);
        int numbers;

        //Ask user how many numbers of fibonacci they want
        System.out.println("How many Fibonacci numbers would you like to print?");
        numbers = sc.nextInt();

        //start timer
        long start = System.currentTimeMillis();

        //the first numbers of the fibonacci sequence are 0 and 1, c will be out next number
        int a=0, b=1, c;

        //for loop with counter starting on first number and loop thru as many numbers as user entered
        for(int i=0; i < numbers; i++){

            //this loop prints out 'a' and a space, n times
            System.out.print(a+" ");

            //as the loop goes on, one by one the variables take on the next value in the sequence
            //c is always the sum of a and b, a becomes b, and b becomes c
            c = a + b;
            a = b;
            b = c;
        }
        //end timer
        long end = System.currentTimeMillis();

        //print time elapsed
        System.out.println("Time: " + (end - start));
    }
}
