
public class Pumpkin {
	double weight;
	double pricePerPound = 3.00;
	
	public  Pumpkin(double pounds){
		weight = pounds;
		
	}
   public void setWeight(double w){
	   weight = w;
}
  public double getWeight(){
	  return weight;
	
}
   public void grow(){
	   weight= weight + pricePerPound*weight;
	   
	   
}
   
}