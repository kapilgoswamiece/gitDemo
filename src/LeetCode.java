
public class LeetCode {

	public static void main(String[] args) {
		
		int arr [] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int max = arr[0];
		int current_sum = arr[0]; 
		
		for(int i = 1; i < arr.length; i++) {
			 if (arr[i] > (arr[i] + current_sum)) {
				 current_sum = arr[i];
				 
			 }
			 else
			 {
				 current_sum = arr[i] + current_sum;
			 }
	
			 
			 if(current_sum > max) {
				 max = current_sum;
			 }
			 
				
				
				
			}
		System.out.println(max);
			
	}
}
		

	