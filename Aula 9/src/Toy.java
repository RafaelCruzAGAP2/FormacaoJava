
public abstract class Toy extends Product {
	
	private int minimumAge;
	
	public Toy(){
		super(1, "ActionMan", 50.0f);
	}
	
	public Toy(int id, String name, float price){
		super(id, name, price);
	}
	
	public Toy(int id, String name, float price, int minimumAge){
		this(id, name, price);
		setMinimumAge(minimumAge);
	}

	public void setMinimumAge(int minimum){
		this.minimumAge = minimum;
	}
	
	public int getMinimumAge(){
		return minimumAge;
	}
	
	@Override
	public String toString(){
		return super.toString() + " MINIMUM_AGE: " +getMinimumAge();
	}
	
	public abstract float CalculateIVA();
	

}
