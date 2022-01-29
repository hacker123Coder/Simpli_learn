package fileHandling;


import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class FileIOStarter {

	public static void main(String[] args) {
		// Creating a new file
		File theFile = new File("sample.txt");//Not the real file, only an object
		
		System.out.println("File exists : " + theFile.exists());
		
		try {
			theFile.createNewFile();// might create a new file
			System.out.println("Files exists now : " + theFile.exists());
		} catch (IOException e) {
			System.out.println("issues : " + e.getMessage());
		}
		
		

	
//Get a FileWriter reference and create the file
		//writing to a file
try {
	FileWriter writer = new FileWriter(theFile);
	
//	Write some content into the file
     writer.write("Hello guys how are you doing\n We are just about \n to complete phase 1");
	
//	Flush before closing
	writer.flush();
	
//	Close
	writer.close();
	
	System.out.println("We wrote some data to the file...");
	
} catch (IOException e) {
	System.out.println("Issues : " + e.getMessage());
}

	

//Create a FileReader
try {
	FileReader reader = new FileReader(theFile);
	
//	Create a character array for data
	char []inputFromFile = new char[100];
	
//	Read the data completely
	reader.read(inputFromFile);
	
//	Traverse through the data read
	for(char ch : inputFromFile) {
		System.out.print(ch);
	}
	
//	Close the reader
	reader.close();
	
} catch (IOException e) {
	System.out.println("Issues : " + e.getMessage());
}

// Append to a file
try {
    String data = " \n Appending the file is successful...";
  // File theFile = new File("sample.txt");
//    if(!f1.exists()) {
//       f1.createNewFile();
//    }

    FileWriter fileWritter = new FileWriter(theFile.getName(),true);
    BufferedWriter bw = new BufferedWriter(fileWritter);
    bw.write(data);
    bw.close();
    System.out.println("Done");
 } catch(IOException e){
    e.printStackTrace();
 }
}
}
















