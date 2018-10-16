package edu.school.masivi;

import java.util.Scanner;

public class Sedma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gosho = new Scanner (System.in);
		int a= gosho.nextInt();
		int b= gosho.nextInt();
		//*b e po malkoto mnojestvo
		int[]arr1=new int[a];
		int[]arr2=new int[b];
		boolean takalie=true;
		boolean sluchilise=false;
		int proverka=0;
		
		while(takalie==true) {
			for(int p=0;p<arr2.length;p++) {//
				proverka=arr2[p];
				for(int q=0;q<arr1.length;q++) {
					if(proverka==arr1[q]) {
						sluchilise=true;
					}
				}
			if(sluchilise==false)	{
				takalie=false;
			}
			}//
		}
if(sluchilise==true) {
	System.out.println("Taka e");
}
else {
	System.out.println("Ne e taka");
}
	}

}
