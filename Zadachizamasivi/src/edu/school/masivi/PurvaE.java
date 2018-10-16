package edu.school.masivi;

import java.util.Scanner;

public class PurvaE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gosho = new Scanner(System.in);
		int a = gosho.nextInt();
		int[]arr=new int[a];
		for(int p=0;p<arr.length;p++) {
			arr[p]=gosho.nextInt();
			
		}

int naigolqmo= arr[0];
for(int p = 0;p<arr.length;p++) {
	if(arr[p]>naigolqmo) {
		naigolqmo=arr[p];
	}

}
int secondhighest = arr[0];  
for(int i=0;i<arr.length;i++) {
if (arr[i] > secondhighest && arr[i] < naigolqmo|| naigolqmo == secondhighest)   
    secondhighest = arr[i];
	}
}
}

