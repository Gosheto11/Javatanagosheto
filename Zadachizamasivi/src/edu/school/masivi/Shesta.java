package edu.school.masivi;

import java.util.Scanner;

public class Shesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gosho = new Scanner(System.in);
		int[]a=new int [11];
		for(int m=0;m<a.length;m++) {
			a[m]=gosho.nextInt();
			
		}
		int naimalko= a[0];
		int naigolqmo= a[0];
		for(int p = 0;p<a.length;p++) {
			if(a[p]>naigolqmo) {
				naigolqmo=a[p];
			}
			
		}
		for(int q = 0;q<a.length;q++) {
			if(a[q]<naimalko) {
				naimalko=a[q];
			}
			
		}
		System.out.print("Nai dobre:");
		for(int n=0;n<a.length;n++) {
			if(a[n]==naigolqmo) {
				System.out.print(a[n]);
			}
		}
		System.out.print("Nai zle:");
		for(int n=0;n<a.length;n++) {
			if(a[n]==naimalko) {
				System.out.print(a[n]);
			}
		}
		
	}

}
