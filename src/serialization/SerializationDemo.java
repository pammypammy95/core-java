

package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// to serialize an object means to convert its state to a byte stream
// so that the byte stream can be reverted back into a copy of the object.

// serialization is a process of converting an object into a sequence of bytes
// which can be persisted to a disk or database or can be sent through streams.

// the reverse process of creating object from sequence of bytes is called de-serialization

public class SerializationDemo implements Serializable{

	String name, city;
	transient int mobile;		// transient or static for not to persist
	int age;
	
	public static void main(String[] args) {
		
		SerializationDemo e = new SerializationDemo();
		
		e.name = "Let Li";
		e.city = "Beijing";
		e.mobile = 98792379;
		e.age = 54;
		
		try {
			
			FileOutputStream fileOut = new FileOutputStream("MyFile.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeObject(e);
			out.close();
			fileOut.close();
			
		} catch (IOException i) {
		
			i.printStackTrace();
			
		}
		
	}

}
