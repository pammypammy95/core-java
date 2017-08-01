package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceStringApplication {

	public static void main(String[] args) {
		
		try {
			
			boolean newFile = false;
			
			File f = new File("replaceString.doc");
			System.out.println(f.exists());
			
			newFile = f.createNewFile();
			System.out.println(newFile);
			System.out.println(f.exists());
			
			FileWriter fw = new FileWriter("replaceString.doc");
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write("abc def ghi abc");
			br.newLine();
			br.write("def ghi abc xyz");
			br.newLine();
			br.write("ghi abc def xyz");
			br.newLine();
			
			br.close();
			
			FileReader fr = new FileReader("replaceString.doc");
			BufferedReader brRead = new BufferedReader(fr);
			
			String s1 = null;
			
			//FileWriter fileWritter;
		    //BufferedWriter bufferWritter = null;
		    
			fw = new FileWriter("replaceString.doc", true);
			br = new BufferedWriter(fw);
			br.newLine();
			
			while((s1 = brRead.readLine()) != null){
				
				if(s1.contains("abc")){
					s1 = s1.replace("abc", "new");
				}

				System.out.println(s1);

		        br.write(s1);
		        br.newLine();

			}
			
			br.close();
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}

}
