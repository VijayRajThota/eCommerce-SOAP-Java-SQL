package user;

public class Quantity {
	private String brand;
	private String count;
	
  public Quantity(String brand, String count)
  {
	  this.brand = brand;
	  this.count = count;
  }
 public Quantity(){
 }
 public String getBrand()
 {
	return brand; 
 }
 public void setBrand(String brand)
 {
	 this.brand = brand;
 }
 public String getCount()
 {
	 return count;
	  }
 public void setCount(String count)
 {
	 this.count = count;
 }
}
