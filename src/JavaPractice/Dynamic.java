package JavaPractice;

import java.util.Scanner;

public class Dynamic {
	
	static int a;
	static int b;
	int c;
	
	void add () {
		c=a+b;
		System.out.println(c);
	}
	
	void sub () {
		c=a-b;
		System.out.println(c);
	}
	void mul () {
		c=a*b;
		System.out.println(c);
	}
	void div () {
		c=a/b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		// using scanner to input data by user
		System.out.println("Please enter the numbers to calculate:");
		
		Scanner s=new Scanner(System.in);
		a= s.nextInt();
		b=s.nextInt();
		Dynamic d=new Dynamic();
		d.add();
		d.sub();
		d.mul();
		d.div();
		
		

	}

}
