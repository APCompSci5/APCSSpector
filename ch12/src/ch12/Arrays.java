package ch12;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray ={1,2,3,4,5,6,7,8,9};
		
         for(int i=0; i< numArray.length;i++)
	         System.out.print(numArray[i] + " ");
        
         System.out.println();
         System.out.print(does6Exist(numArray));
         
        
         
         for(int i=0; i<numArray.length;i++){
        	 System.out.print(reverse(numArray));
         }
         
         
	}
	//Write a Java program to test if an array contains a specific value 
    
	public static boolean does6Exist(int[] testArray){
		
		boolean exists = false;
		
		for(int x = 0; x < testArray.length; x++){
			
			System.out.print(testArray[x]);
			
		if(testArray[x] == 6){
			exists = true;
		    System.out.println("found");
		}
		}
		return exists; 
		}
		
//write a method that reverses the items in the array.
    public static int[] reverse(int[] array){
    	
    	int[] reversedArray= new int[array.length];
    	for(int i=0; i< array.length; i++){
    	  reversedArray[array.length-i-1] = array[i];
    		
    	}
    	return reversedArray; 
    }
    public static void displayArray(int array[]){
    	for(int index=0; index< array.length; index++)
    		System.out.print(array[index] + " ");
    }
    //Write a Java program to calculate the average value of array elements
    public static int Average(int array[]){
    	int x=0;
    	for(int i=0; i<array.length;i++){
    		
    		x=x+i;
    		x=x/array.length;
    		
    	}
    	return x;
    }
    
  
    
   //Write a Java program to find the index of an array element
    public static void findIndex(int array[]){
    	
    }
    
    //Challenge:Write a Java program to remove a specific element and return the array without any elements
    
}


