package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class BinaryReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no for binary conversion : ");
        int n = sc.nextInt();
        int[] arr = Binary.toBinary(n);

        System.out.print("Binary of "+n+" is : ");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]);
        }

        int[] swapped = swapNibbles(arr);
        System.out.print("\nSwapped binary is ");
        for (int i = 0; i< swapped.length; i++){
            System.out.print(swapped[i]);
        }

        int num = toDecimal(swapped);
        System.out.println(" Which is "+num+" in decimal");
    }
    public static int[] swapNibbles(int[] arr){
        int[] swap = new int[8];
        for (int i = 0, j= 4; i<4; i++, j++){
            swap[i] = arr[j];
        }
        for (int i = 4, j = 0; i<8; i++, j++){
            swap[i] = arr[j];
        }
        return swap;
    }
    public static int toDecimal(int[] binary){
        int num = 0;
        for( int i = 0; i< binary.length; i++){
            num = num * 2 + binary[i];
        }
        return num;
    }
}
