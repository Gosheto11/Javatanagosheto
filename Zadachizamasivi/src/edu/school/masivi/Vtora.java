package edu.school.masivi;

import java.util.Scanner;

public class Vtora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner gosho = new Scanner(System.in);
			int a = gosho.nextInt();
			int[]arr=new int[a];
			for(int p=0;p<arr.length;p++) {
				arr[p]=gosho.nextInt();
				
			}

	int naimalko= arr[0];
	for(int p = 0;p<arr.length;p++) {
		if(arr[p]<naimalko) {
			naimalko=arr[p];
		}

	}
	int second = arr[0];  
	for(int i=0;i<arr.length;i++) {
	if (arr[i] < second && arr[i] > naimalko|| naimalko == second)   
	    second = arr[i];
		}
	int otg = naimalko+second;
	}
	

}


