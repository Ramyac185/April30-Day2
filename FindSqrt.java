package week1.day2;

public class FindSqrt {
	public static void main(String[] args) {
		int num = 11,sqrt =0;
		for(int i = 1; i <= num; i++) {
			if(num%i == 0) {
				if(i*i <= num) {
					sqrt = i;
				}
			}
		}
		System.out.println("Square root of "+num+" is "+sqrt);
	}
}
