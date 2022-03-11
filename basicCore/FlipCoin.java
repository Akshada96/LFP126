package com.bridgelabz.basicCore;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of times to Flip Coin : ");
        int n=sc.nextInt();
        int head=0;
        int tail=0;
        for(int i=0; i<n; i++){
            double r = Math.random();
            if(r<0.5){
                tail++;
            }
            else{
                head++;
            }
        }
        System.out.println("head : "+head);
        System.out.println("tail : "+tail);
        float percent= ((float) head/n)*100;
        System.out.println("Percentage of head vs tail : "+(int)percent+"%");
    }
}
