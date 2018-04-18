package DayOne.examples;

public class ExampleAndOr {

	public static void main(String[] args) {
		int x,y;
		x=10;
		y=-10;
		if(x>0 && y>0) {
			System.out.println("both numbers are +ve");
			
		}else if(x>0 || y>0) {
			System.out.println("atleast one number is +ve");
			
		}else {
			System.out.println("Both numbers are -ve");
		}
			

	}

}
