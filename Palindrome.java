package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		
		String value  ="Madam";
		String revValue = "";
		char[] ch = value.toCharArray();
		for (int i = ch.length -1; i >= 0; i--) {
			revValue += value.charAt(i);
		}
		System.out.println(revValue);
		if (value.equalsIgnoreCase(revValue)) {
			System.out.println("The given string is a Palindrome");
		}
		else {
			System.out.println("The given String is not a Palindrome");
		}
	}
}
