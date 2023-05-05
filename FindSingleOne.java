package week1.day2;

public class FindSingleOne {

	public static void main(String[] args) {
		int[] nums = {4,1,2,2,1};
		int n = nums.length;
		boolean visited[] =new boolean[n];
		
		for(int i = 0; i < n; i++) {
			if(visited[i] == true) 
				continue;
			int count =1;
			for (int j =1; j< n; j++) {
				if(nums[i] == nums[j]) {
					visited[j] = true;
					count++;
				}
			}
			if(count == 1) {
				System.out.println(nums[i]+ " is occurred once in the array");
			}
		}
	}
}
