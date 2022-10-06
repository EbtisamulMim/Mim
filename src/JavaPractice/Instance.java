package JavaPractice;

public class Instance {
	
	//instance or global variable
	
	int a=40;
	int b=10;
	int c;
			
	
	void add() {
		c=a+b;
		System.out.println(c);
	}
	void sub() {
		c=a-b;
		System.out.println(c);
	}
	
    void mul() {
    	c=a*b;
    	System.out.println(c);
	}
    void div() {
    	c=a/b;
    	System.out.println(c);
}
	public static void main(String[] args) {
		Instance i=new Instance();
		i.add();
		i.sub();
		i.mul();
		i.div();
		
		

	}

}
