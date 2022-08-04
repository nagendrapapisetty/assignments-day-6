package com.bridgelabz.demo;
import java.util.Scanner;
public class primeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times FLIP the COIN*");
        int n = sc.nextInt();
        System.out.println("Enter the number of times FLIP the COIN*");
        int head =0,tail=0;
        for(int i=0;i<n;i++){
            if(Math.random()<0.5){
                head++;
            }else{
                tail++;
            }
        }
        int hper = (head*100)/n;
        int tper = (tail*100)/n;
        System.out.println("Head Percentage==>>"+hper+"%");
        System.out.println("Tail Percentage==>>"+tper+"%");
        System.out.println("HEADS ==>> "+head);
        System.out.println("TAILS ==>> "+tail);



    }

}
