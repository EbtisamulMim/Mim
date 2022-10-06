package JavaPractice;

public class Shape1 {
	
	int l=20;
	int w= 10;
	
 int rectangle() {
	 int areaR=l*w;
	 return areaR;
		
	}
 int square() {
	 int areaS=l*l;
	 return areaS;
 }
 int triangle() {
	 double areaT=.5*l*w;
	 return (int) areaT;
 }

	public static void main(String[] args) {
		Shape1 s=new Shape1();
		int areaR=s.rectangle();
		int areaS=s.square();
		int areaT=s.triangle();
		
		System.out.println ("The area of rectangle is "+ areaR);
		System.out.println ("The area of squareis "+ areaS);
		System.out.println ("The area of triangle is "+ areaT);

	}

}
