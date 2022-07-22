package overriding;

public class car extends vehicle{

	car(){
		System.out.println("Car obj : "+this);
	}
	
	String fuel() {
		return "Diesel";
	}
}
