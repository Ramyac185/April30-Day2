package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(3, 11, 73));
		System.out.println(calc.mul(3, 3));
		calc.sub();
		
	}
}
