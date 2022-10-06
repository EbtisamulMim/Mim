package JavaPractice;

public class Result {
	
	int Physics=88;
	int Chemistry= 90;
	int Biology = 92;
	int Math=98;
	int English=86;
	
	void average() {
		int Average=(Physics+Chemistry+Biology+Math+English)/5;
		System.out.println(Average);
		
	}

	public static void main(String[] args) {
		System.out.print("The average marks of the student is ");
		Result r=new Result();
		r.average();
		

	}

}
