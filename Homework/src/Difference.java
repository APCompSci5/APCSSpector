
public class Difference {
	

	public static void main(String[] args) {

		
	}
	

public int bigDiff(int[] nums) {

  int min = nums[0];

  int max = nums[0];

   

  for (int i = 0; i < nums.length; i++){

    min = Math.min(min,nums[i]);//takes the minimum value in the whole array

    max = Math.max(max,nums[i]);//takes the maximum value in the whole array

  }

  return max-min;// returns the difference between the largest and smallest value in the array
}
			
		  
	public boolean pair7(int[] nums) {
		
 for (int i = 0; i < (nums.length-1) ; i++) {
		    
	if (nums[i]==7 && nums[i+1]==7) // if the index and the index next to the value in the array are equal to 7 
		    	
		return true;
		   
	if(nums[i]==7 && nums[i+2]==7) // if the index and the following index are equal to 7
		    	
		return true;
		 
           }
		  
 return false;  
}
	public int[] notAlone(int[] nums, int val) {
			
		for(int i=1;i<nums.length-1;i++){
			
				if (nums[i] == val)// compares a value in the array to the lone value outside the array
				
				if (nums[i-1] != nums[i] && nums[i+1] != nums[i])// compares the indexes in front and behind the specified index
			
				if (nums[i+1] > nums[i-1]) // if the index in front is greater than the index behind, the index is replaced by the value of the index after that
				 	
				 nums[i] = nums[i+1];
				
			 else if (nums[i+1] < nums[i-1]) // if the index in front is less than the index in front than the index behind replaces the value at that particular index
				 	
				 nums[i] = nums[i-1];
				
				   }
				
				   return nums;
	}
				
			
				
				
		
		
	}	
	
	
		
	
		 
