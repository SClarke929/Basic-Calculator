public class calc {
	//INTEGER ANSWERS
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mult(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
	//DECIMAL ANSWERS
	public double dadd(double c, double d) {	
		return c + d;
	}
	public double dsub(double c, double d) {	
		return (float) c - d;
	}
	public double dmult(double c, double d) {	
		return (float) c * d;
		
	}public double ddiv(double c, double d) {	
		return (float) c / d;
	}
	public static void main(String[] args) {
			calc myCalculator = new calc();
			System.out.println(myCalculator.add(4,7));
	
			System.out.println(myCalculator.sub(7,3));
	
			System.out.println(myCalculator.mult(4,7));
		
			System.out.println(myCalculator.div(4,7));
			
			System.out.println(myCalculator.div(0,7));
			
			System.out.println(myCalculator.dadd(4.2,7.15));
			
			System.out.println(myCalculator.ddiv(87.5,4.61));
			
			System.out.println(myCalculator.div(78,2));
			
			System.out.println(myCalculator.div(-78,2));
	//Found that Calculator will not run after a divide by zero instance.
	}
}