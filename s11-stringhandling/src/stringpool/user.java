package stringpool;

public class user {

	int id;
	public String name;
	
	public user(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		user other = (user)obj;
		return this.id==other.id && this.name.equals(other.name);
	}
}
