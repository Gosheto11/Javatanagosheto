package edu.school.masivi;

import java.util.Scanner;

public class Peta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, temp;
	        Scanner gosho = new Scanner(System.in);
	        
	        n = gosho.nextInt();
	        int a[] = new int[n];
	       int half=n/2;
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = gosho.nextInt();
	        }
	        for (int i = half; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	    
	        
	        }
	        
	        for (int i = 0; i < half; i++) 
	        {
	            for (int j = i + 1; j < half; j++) 
	            {
	                if (a[i] < a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	    
	        
	        }
	        for(int i = 0; i < n; i++) {
	        	System.out.print(a[i]);
	        }
	}

}
