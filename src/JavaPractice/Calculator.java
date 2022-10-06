package JavaPractice;

public class Calculator {
	//local variable
	void add() 
	{
	 int a=20;
	 int b= 10;
	 int c=a+b;
	 System.out.println(c);
	 }

	void sub() 
	{
	 int a=20;
	 int b= 10;
	 int c=a-b;
	 System.out.println(c);
	 }
	void mul() 
	{
	 int a=20;
	 int b= 10;
	 int c=a*b;
	 System.out.println(c);
	 }
	void div() 
	{
	 int a=20;
	 int b= 10;
	 int c=a/b;
	 System.out.println(c);
	 }
	
	
	public static void main(String[] args) {
		
	Calculator c= new Calculator();
	c.add();
	c.sub();
	c.mul();
	c.div();
	

	}

}
