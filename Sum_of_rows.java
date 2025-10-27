package com.codegnan.arrays;

import java.util.Scanner;

public class Sum_of_rows {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
			int row  =sc.nextInt();
			
	        System.out.print("Enter number of columns: ");
			int column = sc.nextInt();
			
			int[][] arr = new int[row][column];
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<row;i++) {
				int sum=0;
				for(int j=0;j<column;j++) {
					System.out.print(arr[i][j] + " ");
					sum+=arr[i][j];
				}
				System.out.println("Sum of all elements: "+sum);
				System.out.println();
			}
			
			
			sc.close();
	}

}
