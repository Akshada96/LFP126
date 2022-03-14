package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no for binary conversion : ");
        int n = sc.nextInt();
        int[] arr = toBinary(n);
        System.out.print("Binary of "+n+" is : ");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
        }

    public static int[] toBinary(int n){
        int[] arr= new int[8];
        int i=0;
        while(n != 0){
            arr[i]=n%2;
            n=n/2;
            i++;
        }
        int[] binary = new int[8];
        for (int j = arr.length-1, k = 0; j>=0; j--,k++){
            binary[k]=arr[j];
        }
        return binary;
    }
}
