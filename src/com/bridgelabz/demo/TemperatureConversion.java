package com.bridgelabz.demo;
import java.util.Scanner;
public class TemperatureConversion {

        public static double fahrenheitToCelsius(double userTemp){
        double celsius = Math.round((userTemp - 32) * 5/9);
        System.out.println(userTemp + " degrees fahrenheit in celsius is: "+ celsius);
        return celsius;
    }
        public static double celsiusToFahrenheit (double userTemp){
        double fahrenheit = Math.round(userTemp * 9/5 + 32);
        System.out.println(userTemp + " degrees celsius in fahrenheit is: "+ fahrenheit);
        return fahrenheit;
    }
        public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int x = 1;
        while (x != 0){
            System.out.println("Please input the temperature you would \nlike to convert: ");
            double userTemp = in.nextDouble();
            String degrees;
            System.out.println("Please input a capital C if the temperature is \ncelsius or"
                    +" a capital F if the temperature is \nFahrenheit: ");
            degrees = in.next();
            double fahrenheit, celsius;

            {if (degrees.equals("C"))
                fahrenheit = celsiusToFahrenheit(userTemp);
            }
            {if (degrees.equals("F"))
                celsius = fahrenheitToCelsius(userTemp);
            }
            System.out.println("Please input any number to continue or 0 to stop: ");
            x = in.nextInt();
        }
    }
}
