package JavaPractice;

public class Return {

	
		// if we want to manipulate a value later
	
	int average() {	
		int Physics=88;
		int Chemistry= 90;
		int Biology = 92;
		int Math=98;
		int English=86;
		int total=Physics+Chemistry+Biology+Math+English;
		return total;
	
	}
	
	public static void main(String[] args) {
		Return r=new Return();
		int total= r.average();
		int avg = total/5;
		System.out.println("The average marks is "+avg);
		
		

	}

}
