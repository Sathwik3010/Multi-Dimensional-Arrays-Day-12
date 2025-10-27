package com.codegnan.arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        // Input dimensions of first matrix
        System.out.print("Enter number of rows in first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns in first matrix: ");
        int c1 = sc.nextInt();
        
     // Input dimensions of second matrix
        System.out.print("Enter number of rows in second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns in second matrix: ");
        int c2 = sc.nextInt();
        
        // Check if multiplication is possible
        if(c1!=r2) {
            System.out.println("Matrix multiplication not possible. Columns of first must equal rows of second.");
            sc.close();
            return;
        }
        
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] result = new int[r1][c2];
        
     // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for(int i=0;i<r1;i++) {
        	for(int j=0;j<c1;j++) {
        		a[i][j]=sc.nextInt();
        	}
        }
        
        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for(int i=0;i<r2;i++) {
        	 for(int j=0;j<c2;j++) {
        		 b[i][j]=sc.nextInt();
        	 }
        }
        
     // Print result
        for(int i=0;i<r1;i++) {
        	for(int j=0;j<c2;j++) {
        		result[i][j]=0;
        		for(int k=0;k<c1;k++) { // r2
        			result[i][j] += a[i][k] * b[k][j];
        		}
        	}
        }
        
        System.out.println("\nResultant Matrix:");
        for(int i=0;i<r1;i++) {
        	for(int j=0;j<c2;j++) {
                System.out.print(result[i][j] + " ");
        	}
        	System.out.println();
        }
        sc.close();
	}

}
