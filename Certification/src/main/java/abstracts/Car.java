package abstracts;

public abstract class Car{
	protected double price;
	protected String model;
	protected String year;
	protected int    speed = 100;
	
	public void goFast(){
	 speed =+ 100;	
	}
	public abstract void goUpHill();
	
	
	
}