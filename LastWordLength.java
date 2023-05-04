package week1.day2;

public class LastWordLength {
	public static void main(String[] args) {
		
		String str = "Hello Selenium";
		String lastWord = str.substring(str.lastIndexOf(" ") +1);
		System.out.println(lastWord.length());
				
	}
}
