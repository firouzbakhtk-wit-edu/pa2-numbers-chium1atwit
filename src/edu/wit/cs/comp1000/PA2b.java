package edu.wit.cs.comp1000;
import java.util.Scanner;


// Matthew Chiu
public class PA2b {

	// Finding roots
	public static void main(String[] args) {
		
		double a,b,c;
		double root1;
		double root2;
		double sqrt;
		double d;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a, b and c for the quadratic formula %n");
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		
		d=(b*b)-(4*a*c);
		sqrt=Math.sqrt(d);
		
		root1=(-(b)+sqrt)/(2*a);
		root2=(-(b)-sqrt)/(2*a);
		
		if (sqrt<0) {
			System.out.printf("Roots: imaginary");
		}else {
			System.out.printf("Roots: %f, %f", root1, root2);
		}
		if(sqrt==0) {
			System.out.printf("There is only 1 root");
		}
		
		
		
		
		
		
		
	}

}
