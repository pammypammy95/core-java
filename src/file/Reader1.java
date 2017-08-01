package file;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Reader1 {

	public static void main(String[] args) {
		
		try {
			// open the file that is the first command line parameter
			// FileInputStream fs = new FileInputStream("c:\\Pamela\\sample.txt"); // absolute path
			// not able to access .pdf .docx
			FileInputStream fs = new FileInputStream("sample.doc"); // relative path
			//c:\\MyFile.txt absolute path
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fs);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String str;
			
			//Read file line by line
			while((str = br.readLine()) != null){
				// print the content on the console
				System.out.println(str);
			}
			
			//close the input stream
			in.close();
			
		} catch (Exception e) { // if any
			//System.out.println("Error: " + e.getMessage()); // Syste.err to show error
			System.out.println("File not found... ");
		}
	}

}
