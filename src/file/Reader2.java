package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader2 {

	public static void main(String[] args) {
		try {
			
			// get data from this file using a file reader
			FileReader fr = new FileReader("sample.txt");
											//c:\\file\\demo.txt
			
			// to store the contents read via FileReader
			BufferedReader br = new BufferedReader(fr);
			
			// read br and store a line in 'data', print data
			String s;
			while((s = br.readLine()) != null){
				System.out.println(s);
				//fr.close();
			}
			
		} catch (IOException e) {
			System.out.println("Sorry!! File not found...");
		}
	}

}
