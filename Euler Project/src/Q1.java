
public class Q1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        System.out.println(Multiples());//The correct answer was Checked
        		
        }
	
public static int Multiples(){
	  int sum=0;
	 for(int i=1; i<1000;i++){
		 if(i % 3==0 || i % 5==0 )
		       sum=sum+i;
		
		 
		  
			  
		 }

	 return sum;
}
}

