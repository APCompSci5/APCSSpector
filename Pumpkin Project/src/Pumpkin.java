
public class Pumpkin {
	private double weight;
	private double pricePerPound=.25;
	private double growth = .5;
	
	public  Pumpkin(double pounds){
		weight = pounds;
		
	}
   public void setWeight(double w){
	   if(w < 100)
	   weight = w;
}
  public double getWeight(){
	  return weight;
	
}
   public void grow(){
    	weight=(weight * growth) + weight;
    	
    }
	  
 
	   
   
   
     public double Price(){
    	 double amount = 0;
	   amount =weight * pricePerPound;
	   return amount;
   }
    
  
}