
public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fizz(6);
		
		}
	public static void fizz( int end){
			int size= end+1;
			String[] array= new String[size];
		for(int i=1; i<array.length;i++){
			
			if((i) % 3==0 && (i) % 5==0)
				array[i]="Fizzbuzz";  
			else if((i) % 3 == 0)
				array[i]="Fizz";
		    else if((i) % 5 == 0)
				array[i]="Buzz";
			else
				array[i]=String.valueOf(i);
			System.out.println(array[i] + " ");
				
		}
	}
	
}