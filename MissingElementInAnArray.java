package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,7,6};
		Arrays.sort(arr1);
		
		for(int i= 0; i< arr1.length; i++) {
			if (i+1 == arr1[i]) {
				continue;
			}
			else {
				System.out.println(i+1);
				}
		}
	}

}
