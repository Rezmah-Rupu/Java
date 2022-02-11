
package java;

import java.util.Scanner;

public class Product {
	
	public static void productCheck(int weight)  {
			try {
		if (weight < 100) {	
			//throw "ProductInvaid";
		System.out.println("ProductInvaid");
	}
		else {
			System.out.println("Product Weight is : " + weight);
			//System.out.println(weight);
		}
	}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
	}
	public static void main (String[] args) throws ArithmeticException{
		int weight;
		
		 Scanner input = new Scanner (System.in);
		 System.out.println("Enter Product Weight.");
		 
		 weight = input.nextInt();
		 productCheck(weight);
			input.close();
			//return 0;
		}
	
}
