package unit03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P15_FileHandling {

	public static void main(String[] args) throws IOException {
		
		FileHandlingInJava obj = new FileHandlingInJava();
		obj.takeInputFromAFileNotFromConsole();
	//	obj.saveOutputIntoFile();
	//	obj.createALogFile();
   
	}4
}

class FileHandlingInJava{
	void takeInputFromAFileNotFromConsole() throws IOException {
		String path = "C:\\Users\\asus\\git\\core-java\\Java Project Ankit\\src\\unit03\\input.txt";
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		while((st = br.readLine()) != null) {
			System.out.println(st);
		}
		br.close();
//		List that holds strings of a file
		//List<Stirng> listOfString = new ArrayList<Stirng>();
		
	//	String line = br.readLine();
	}
	void saveOutputIntoFile() {
		
    }
	void createALogFile() {
		
	}

	1. multi processing 
    - sequencial multi processing 
    - parallel multi processing
    - concurrent multi processing 
2. multi tasking 
   - sequencial multi tasking 
   - parallel multi tasking
   - concurrent multi tasking
 
}