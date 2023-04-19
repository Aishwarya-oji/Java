package serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serial123 {
	public static void main(String args[]) {
		System.out.println("name=" + object1.name);
		System.out.println("age=" + object1.age);
		System.out.println("a=" + object1.a);
		System.out.println("b=" + object1.b);
		
	}
	public static void main(String args[]) {
		Emp object =new Emp("ab",20,2,1000);
		String filename="";
		try {
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been seialized\n"+"data after deserialisation.");
			printdata(object);
		}
		catch(IOException ex) {
			System.out.println("ClassNotFoundException"+"is caught");
		}
	}

}
