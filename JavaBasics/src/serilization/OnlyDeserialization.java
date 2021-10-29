package serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OnlyDeserialization {

	
	public static void main(String[] args) {
		// Deserialization
				try {

					String filename = "Jaga.txt";
					// Reading the object from a file
					FileInputStream file = new FileInputStream(filename );
					ObjectInputStream in = new ObjectInputStream(file);

					// Method for deserialization of object
					Emp object = (Emp) in.readObject();

					in.close();
					file.close();
					System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
					SerialExample.printdata(object);

					// System.out.println("z = " + object1.z);
				}

				catch (IOException ex) {
					System.out.println("IOException is caught");
				}

				catch (ClassNotFoundException ex) {
					System.out.println("ClassNotFoundException" + " is caught");
				}
	}
}
