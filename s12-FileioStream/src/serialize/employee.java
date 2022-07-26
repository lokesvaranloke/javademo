package serialize;

import java.io.Serializable;

public class employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	double salary;
	transient int aadhar;
	//transient will not the result to console we cannot see that
	
	public employee(int id, String name, double salary, int aadhar) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadhar=aadhar;
	}
	
	@Override
	public String toString() {
		return "Id="+id+"| Name="+name+"| salary="+salary+"| aadhar="+aadhar;
	}
}
