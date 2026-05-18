package bean;

public class Car {
 
	private long num;
	private String brand;
	private float rate;
	private Engine eng;
	public Engine getEng() {
		return eng;
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	
   public void display() {
	   System.out.println("Car Number: "+num);
	   System.out.println("Car brand: "+brand);
	   System.out.println("Rate: "+rate);
	   System.out.println("==>"+eng);
   }
}
