package com.codegnan.arrays;

import java.util.Scanner;

public class RowColProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns]; 
        
        // Input elements
        System.out.println("Enter elements of the matrix:");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<columns;j++) {
        		matrix[i][j]=sc.nextInt();
        	}
        }
        
     // Row-wise product
        System.out.println("\nRow-wise product:");
        for(int i=0;i<rows;i++) {
        	int product=1;
        	for(int j=0;j<columns;j++) {
        		product*=matrix[i][j];
        	}
            System.out.print(" Product of Row " + (i + 1) + " = " + product);
        }
        
     // Column-wise product
        System.out.println("\nColumn-wise product:");
        for(int j=0;j<columns;j++) {
        	int product=1;
        	for(int i=0;i<rows;i++) {
        		product*=matrix[i][j];
        	}
            System.out.print(" Product of Row " + (j + 1) + " = " + product);
        }
        sc.close();
	}

}
