package day14.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileProgram7_ReadFileUsingFileReader {
public static void main(String[] args) throws Exception {

	FileReader filereader=new FileReader("myfolder/myfile2.txt");
	BufferedReader br=new BufferedReader(filereader);
	String buffer;
	while((buffer=br.readLine())!=null)
		System.out.println(buffer);
	
}
}
