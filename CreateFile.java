package day14.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		//try with resources
		FileWriter f1=new FileWriter("myfolder/myfileIn.txt",true);
		f1.append(" Best of luck");
		System.out.println("File Created");
		f1.close();

	}
}
