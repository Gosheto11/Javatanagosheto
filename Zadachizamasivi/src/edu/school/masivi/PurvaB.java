package edu.school.masivi;

import java.util.Scanner;

public class PurvaB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gosho = new Scanner(System.in);
		int a = gosho.nextInt();
		int[]arr=new int[a];
		for(int p=0;p<arr.length;p++) {
			arr[p]=gosho.nextInt();
			
		}
	int suma = 0;
	for(int q=0;q<arr.length;q=q+2) {
		suma=suma+arr[q];
	}
	double sredno = (double)suma/(double)a;
	double nmr =sredno - (double)arr[0];
    double razlika = 0;
	for(int m=1;m<arr.length;m++) {
		if(sredno-arr[m]<0) {
			razlika=arr[m]-sredno;
		}
		else {
			razlika=sredno - arr[m];
		}
		if(razlika<nmr) {
			nmr=razlika;
		}
	}
System.out.println(sredno-nmr);


	}

}
