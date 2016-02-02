public abstract class Product {
	
	/*
	 * Attributes
	 */
	public int id;
	public String name;
	public float price;
	
	public Product(int id){
		this.id = id;
	}
	
	public Product(){
		
	}
	
	public Product(int id, String name, float price){
		this(id);
		this.name = name;
		this.price = price;
	}
	
	public abstract float CalculateIVA();
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder().append("ID: ")
							.append(id)
							.append(" NAME: ")
							.append(name)
							.append(" PRICE: ")
							.append(price);
		return sb.toString();
		
	}
}