package ch12;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray ={1,2,3,4,5,6,7,8,9};
		
         for(int i=0; i< numArray.length;i++)
	         System.out.print(numArray[i] + " ");
        
         System.out.println();
         System.out.print(does6Exist(numArray));
         
        
         
        
        	 displayArray(reverse(numArray));
        	 System.out.println("found index is " +findIndex(numArray,3));
       // System.out.println("the position of the index of 3",2);
         
         
	}
	 //Write a Java program to find the index of an array element
    public static int findIndex(int my_array[], int t){
    	if(my_array == null) return -1;
    	int len= my_array.length;
    	int i=0;
    	while(i<len){
    		if(my_array[i]== t) return i;
    	else i=i+1;
    	}
    	return -1; 
    	
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
    	
    	for(int i=0; i<array.length/2; i++){ 
    		int temp = array[i]; 
    		
    		array[i] = array[array.length -i -1]; 
    	
    	   array[array.length -i -1] = temp; 
    	   
    	}

    	
    		
    	
    	return array; 
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
    
  
    
  
   
    //Challenge:Write a Java program to remove a specific element and return the array without any elements
    /*public static int[] removeArray(int[] oldArray, int num){
    	int[] newArray = new Int[oldArray.length-1];
    	for(int k=0; k< oldArray; k++){
    		//check to see if the item in the old array
    		//if its not, then you want to copy over the item into the newArray
    	}
    	return newArray;
    }
  */  
}


