package edu.school.masivi;

import java.util.Scanner;

public class Treta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner gosho =  new Scanner(System.in);
		int a= gosho.nextInt();
		int b= gosho.nextInt();
		int[]arr1=new int[a];
		int[]arr2=new int[b];
		
		int counter1=0;
		int counter2=0;
		for(int p=0;p<arr1.length;p++) {
			counter1=arr1[p];
			for(int q=0;q<arr2.length;q++) {
				counter2=arr2[q];
				if(counter1==counter2) {
					System.out.println(counter1);
				}
			}
		}

	}

}
