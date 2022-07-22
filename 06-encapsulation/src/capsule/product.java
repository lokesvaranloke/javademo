package capsule;

public class product {

	private int id;
	private String name;
	private double cost;
	
	product(int id, String name, double cost){
		this.id=id;
		this.name = name;
		this.cost = cost;
	}
	
	public int getid() {
		return this.id;
	}
	
	public String getname() {
		return this.name;
	}
	
	public double getcost() {
		return this.cost;
	}
}
