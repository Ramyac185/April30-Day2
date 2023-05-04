package week1.day2;

public class Calculator {

	public int add(int firstNum,int secNum, int thirdNum) {
		int sum = firstNum + secNum + thirdNum;
		return sum;
	}
	
	protected int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	void sub() {
		int a = 5,b = 2;
		int diff = a - b; 
		System.out.println(diff);

	}
	
	private int divide (int bigNum, int smallNum) {
		int quotient = bigNum / smallNum;
		return quotient;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.divide(17, 4));
	}

}
