package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "MostlyCloudy";
		String output = "";
		char[] ch = test.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i%2 != 0) {
				output = output + Character.toUpperCase(test.charAt(i));
			}
			else {
				output += test.charAt(i);
			}
		}
		System.out.println(output);
	}

}
