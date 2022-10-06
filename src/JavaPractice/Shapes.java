package JavaPractice;

public class Shapes {
	
	void rectangle(int l,int w) {
		int area=l*w;
		System.out.println("The area of rectangle is "+ area);
	}
	
    void sqare(int l1, int l2 ) {
    	int area=l1*l2;
    	System.out.println("The area of sqare is "+ area);
    	
    }
    
    void triagle (int l, int w) {
    	double area=.5*l*w;
    	System.out.println("The area of triangle is "+ area);
    }
    
	public static void main(String[] args) {
				
		Shapes s=new Shapes();
		s.rectangle(10, 5);
		s.sqare(4, 4);
		s.triagle(10, 6);
		
		

	}

}
