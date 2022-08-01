package serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializationdemo {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("C:\\Javafd\\temp\\emp.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			employee e1 = new employee(1,"vijay",25000,1234);
			oos.writeObject(e1);
			System.out.println("serialized objects");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
