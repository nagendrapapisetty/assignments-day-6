package com.bridgelabz.demo;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int number = 5;
        int prevnumber = 0;
        int currentnumber = 1;
        int i;
        System.out.println( "fibonacci series of " + number + " is " + prevnumber + "," + currentnumber);
        for (i=2;i<number;i++)
        {
            int nextnumber = prevnumber + currentnumber;
            prevnumber = currentnumber;
            currentnumber = nextnumber;

            System.out.println("," +nextnumber);
        }


    }
}
