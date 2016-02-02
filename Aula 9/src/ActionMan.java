
public class ActionMan extends Toy {
	
	private final String type;
	
	public ActionMan(int id, String name, float price, int minimumAge, String type){
		super(id, name, price, minimumAge);
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public String toString(){
		return super.toString() + " TYPE: " + getType();
	}

	@Override
	public float CalculateIVA() {
		return 23;
	}

}
