package edu.wit.cs.comp1000;
import java.util.Scanner;



// Matthew Chiu
public class PA2a {

	 
	public static void main(String[] args) {
		
		double a,b,c,d,e;
		double sumpos;
		double sumneg;
		double sumall;
		double avgpos;
		double avgneg;
		double avgall;
		double neg1=0;
		double neg2=0;
		double neg3=0;
		double neg4=0;
		double neg5=0;
		double pos1=0;
		double pos2=0;
		double pos3 =0;
		double pos4=0;
		double pos5=0;
		double poscounter=0;
		double negcounter=0;
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter your 5 numbers %n");
		a = input.nextDouble();
		System.out.printf("%n");
		b = input.nextDouble();
		System.out.printf("%n");
		c = input.nextDouble();
		System.out.printf("%n");
		d = input.nextDouble();
		System.out.printf("%n");
		e = input.nextDouble();
		System.out.printf("%n");
		
		// A
		if(a<0) {
			neg1=a;
			negcounter=negcounter+1;
		}else if(a > 0) {
			pos1=a;
			poscounter=poscounter+1;
		}
		
		// B
		if(b<0) {
			neg2=b;
			negcounter=negcounter+1;
		}else if(b > 0) {
			pos2=b;
			poscounter=poscounter+1;
		}
	
		// C
		if(c<0) {
			neg3=c;
			negcounter=negcounter+1;
		}else if(c > 0) {
			pos3=c;
			poscounter=poscounter+1;
		}
		
		//D
		if(d<0) {
			neg4=d;
			negcounter=negcounter+1;
		}else if(d > 0) {
			pos4=d;
			poscounter=poscounter+1;
		}
		
		// E
		if(e<0) {
			neg5=e;
			negcounter=negcounter+1;
		}else if(e > 0) {
			pos5=e;
			poscounter=poscounter+1;
		}
		
		// Calculations
		sumpos=pos1+pos2+pos3+pos4+pos5;
		sumneg=neg1+neg2+neg3+neg4+neg5;
		sumall=a+b+c+d+e;
		
		avgpos=(pos1+pos2+pos3+pos4+pos5)/poscounter;
		avgneg=(neg1+neg2+neg3+neg4+neg5)/negcounter;
		avgall=(a+b+c+d+e)/5;
		
		System.out.printf("The sum of the positive numbers: %f%n",sumpos);
		System.out.printf("The sum of the 3 negative numbers: %f%n",sumneg);
		System.out.printf("The sum of all 5 numbers: %f%n",sumall);
		System.out.printf("The average of the positive numbers: %f%n",avgpos);
		System.out.printf("The average of the negative numbers: %f%n",avgneg);
		System.out.printf("The average of all numbers: %f%n",avgall);
	}


}