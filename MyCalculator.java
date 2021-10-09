package assignment.week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println("Addition of 3 Numbers is:" + obj.add(10, 20, 30));
		System.out.println("Subtraction of 2 Numbers is:" + obj.sub(35, 15));
		System.out.println("Multiplication of 2 Numbers is:" + obj.mul(20, 5));
		System.out.println("Division of 2 Numbers:" + obj.div(10, 3));
	}

}
