package edu.school.masivi;

import java.util.Scanner;

public class PurvaD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gosho = new Scanner(System.in);
		int a = gosho.nextInt();
		int[]arr=new int[a];
		for(int p=0;p<arr.length;p++) {
			arr[p]=gosho.nextInt();
			
		}
int naimalko= arr[0];
int naigolqmo= arr[0];
for(int p = 0;p<arr.length;p++) {
	if(arr[p]>naigolqmo) {
		naigolqmo=arr[p];
	}
	
}
for(int q = 0;q<arr.length;q++) {
	if(arr[q]<naimalko) {
		naimalko=arr[q];
	}
	
}
int otg = naigolqmo-naimalko;
System.out.println(otg);
	}

}
