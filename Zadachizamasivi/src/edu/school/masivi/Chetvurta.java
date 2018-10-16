package edu.school.masivi;

import java.util.Scanner;

public class Chetvurta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner gosho = new Scanner(System.in);
   int a= gosho.nextInt();
	int b= gosho.nextInt();
	int[]arr1=new int[a];
	int[]arr2=new int[b];
	int[]arr3= new int[a+b];
	
	for(int p=0;p<arr1.length;p++) {
		arr3[2*p]=arr1[p];
		for(int q=0;q<arr2.length;q++) {
			arr3[2*q + 1]=arr2[q];
	}
}
	for(int m:arr3) {
		System.out.println(arr3[m]);
	}
	}
}