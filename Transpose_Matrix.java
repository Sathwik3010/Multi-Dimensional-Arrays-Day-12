package com.codegnan.arrays;

import java.util.Scanner;

public class Transpose_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        // Input: rows and columns
		  System.out.print("Enter number of rows: ");
	      int row = sc.nextInt();
	        
	      System.out.print("Enter number of Column: ");
	      int column = sc.nextInt();
	      
	        // Declare matrix
	      int[][] matrix = new int[row][column];
	      
	        // Input elements
	      for(int i=0;i<row;i++) {
	    	  for(int j=0;j<column;j++) {
	    		  matrix[i][j]=sc.nextInt();
	    	  }
	      }
	      
	      int[][] transpose = new int[column][row];
	      
	      for(int i=0;i<row;i++) {
	    	  for(int j=0;j<column;j++) {
	    		  transpose[j][i]=matrix[i][j];
	    	  }
	      }
	      
	      System.out.println("\nTranspose of the matrix:");
	      for(int i=0;i<column;i++) {
	    	  for(int j=0;j<row;j++) {
	    		  System.out.print(transpose[i][j] + " ");
	    	  }
	    	  System.out.println();
	      }
	      sc.close();
	}

}
