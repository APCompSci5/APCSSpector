
public class getMean {

	public static void main(String[] args) {
		int[] list = {2,3,4,5};
		System.out.print(Mean(list));
	}
	
		public static double Mean(int[] list)
		{
			double sum = 0;
			double average = 0;
         for(int i=0; i<list.length;i++){
			
	           sum = sum + list[i];
			
			
			
	           average = sum/list.length;


	 
		}

	return average;			


		}
}


