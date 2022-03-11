package com.bridgelabz.basicCore;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the power value : ");
        int n = sc.nextInt();
        do {
            if(n<0 || n>=31){
                System.out.print("Enter the power value between 0 to 30 only : ");
                n = sc.nextInt();
            }
            else {
                break;
            }
        }
        while (true);
        int pow=1;
        for(int i=1; i<=n; i++){
            pow*=2;
            //System.out.println("2^"+i+" = "+pow);
        }
        System.out.println("2^"+n+" = "+pow);
    }
}
