package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialize {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("C:\\Javafd\\New folder\\emp3.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			employee e1 = (employee) ois.readObject();
			System.out.println("Deserialized objects");
			System.out.println(e1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
