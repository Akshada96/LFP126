package com.bridgelabz.basicCore;

import java.util.Scanner;

public class SumZeroTriplets {
    public static void main(String[] args){
        //int[] arr = {0,-1,2,-3,1};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+" array elements : ");
        int[] arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        System.out.println("Triplets are :");
        for (int i=0; i< arr.length-2; i++){
            for (int j=i+1; j< arr.length-1; j++){
                for (int k=j+1; k< arr.length; k++){
                    if (arr[i]+arr[j]+arr[k] == 0){
                        count++;
                        System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
                    }
                }
            }
        }
        System.out.println("Total no of triplets are "+count);
    }
}
