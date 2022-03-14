package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Change in Rs to be returned by the Vending Machine : ");
            int change = sc.nextInt();
            int[] notes = new int[]{1, 2, 5, 10, 50, 100, 500, 1000};
            int[] returnNotes = new int[8];
            int count = 0;
            int j = 0;

            for (int i = notes.length - 1; i >= 0; i--) {
                //System.out.println("Note : "+notes[i]);
                boolean returnNote = false;
                while (change >= notes[i]) {
                    change = change - notes[i];
                    //System.out.println("Remaining Change : "+change);
                    count++;
                    returnNote = true;
                }
                if (returnNote){
                    returnNotes[j]=notes[i];
                    j++;
                }
            }
            System.out.println("No of minimum Note needed to give the change : " + count);
            System.out.println("List of notes given in the change : ");
            for (int i=0; i<j; i++){
                System.out.print(returnNotes[i]+" ");
            }
    }
}
