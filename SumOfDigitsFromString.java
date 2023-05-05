package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		int sum = 0;
		String s1 = "Test12leaf349";
		for (int i = 0; i< s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i))) {
				sum++;
			}
		}
		System.out.println("Number of digits in the string "+s1+ " is "+sum);
	}

}
