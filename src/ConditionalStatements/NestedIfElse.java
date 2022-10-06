package ConditionalStatements;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter you number:");
		int a=s.nextInt();
		
		
		if(a>=90 && a<100){
			System.out.println("The grade is A");
			
		}
		else if (a>=80 && a<90) {
			System.out.println("The grade is B");
		}
		
		else if (a>=70 && a<80) {
			System.out.println("The grade is C");
		}
		
		else if (a>=60 && a<70) {
			System.out.println("The grade is D");
		}
		
		else if (a>=70 && a<80) {
			System.out.println("The grade is E");
		}
		else {
			System.out.println("The grade is F");
		}

	}

}
