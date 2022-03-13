package com.bridgelabz.basicCore;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int n = sc.nextInt();
        System.out.print("Enter total "+m*n+" numbers : ");
        int[][] array = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                //System.out.println("Enter the array element : ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are :");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
