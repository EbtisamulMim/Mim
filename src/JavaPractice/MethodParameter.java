package JavaPractice;

public class MethodParameter {
	
	void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	void sub(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	void mul(int a,int b) {
		int c=a*b;
		System.out.println(c);
	}
	void div(int a,int b) {
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
        // pass by value
		MethodParameter m=new MethodParameter();
		m.add(10, 2);
		m.sub(12, 10);
		m.mul(10, 5);
		m.div(12, 6);

	}

}
