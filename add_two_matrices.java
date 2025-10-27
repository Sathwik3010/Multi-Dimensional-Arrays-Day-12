package com.codegnan.arrays;

import java.util.Scanner;

public class add_two_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of columns");
		int columns = sc.nextInt();
		
		int[][] a = new int[rows][columns];
		int[][] b = new int[rows][columns];
		int[][] sum = new int[rows][columns];
		
        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<columns;j++) {
        		a[i][j]=sc.nextInt();
        	}
        }
        
        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<columns;j++) {
        		b[i][j]=sc.nextInt();
        	}
        }
        
        // Add both matrices
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<columns;j++) {
        		sum[i][j] = a[i][j] + b[i][j];
        	}
        }
        // Print result
        System.out.println("\nSum of matrices:");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<columns;j++) {
        		System.out.print(sum[i][j]+" ");
        	}
        	System.out.println();
        }
        sc.close();
	}

}
