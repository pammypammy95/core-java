package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer1 {

	public static void main(String[] args) {
		
		try {
			
			boolean newFile =  false;
			//c:\\file\\demo.txt
			File f = new File("abcxyz.doc");	// look for a file
			System.out.println(f.exists());		// look for a real file // false, true
			
			newFile = f.createNewFile();		// if not exist then create a file
			System.out.println(newFile); 		// already there? // true, false
			System.out.println(f.exists()); 	// look again // true, false
			
			FileWriter fw = new FileWriter("abcxyz.doc"); 	// open existing file
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write("This is filewriter?");
			//br.flush();
			br.newLine();
			//br.flush();
			br.write("Thank you...");
			br.newLine();
			br.write("Java");
			br.newLine();
			br.write("SAP");
			br.newLine();
			br.write(".Net");
			
			br.close();
			
			FileReader fr = new FileReader("abcxyz.doc");
			
			//To store the contents read via FileReader
			BufferedReader brRead = new BufferedReader(fr);
			
			//Read br and store a line in 'data', print data
			String s1 = null;
			
			while((s1 = brRead.readLine()) != null){
				System.out.println(s1);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
