package com.bridgelabz.demo;

public class PerfectNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int perfectnumber = 28;
        int sumofdivisior = 0;
        for (int index=1;index <=perfectnumber/2;index++)
        {
            if(perfectnumber%index == 0)
            {
                sumofdivisior=sumofdivisior+index;

            }
        }
        if(sumofdivisior == perfectnumber)
        {
            System.out.println(perfectnumber + "is a perfect number");
        }
        else
        {
            System.out.println(perfectnumber + "is not a perfect number");

        }
    }
}
