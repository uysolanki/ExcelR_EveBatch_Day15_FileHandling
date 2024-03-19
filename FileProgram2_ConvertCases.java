package day14.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileProgram2_ConvertCases {
public static void main(String[] args) throws IOException {
	FileInputStream fin=new FileInputStream("myfolder/myfile.txt");
	int n;
	do
	{
		n=fin.read();
		char ch=(char)n;
		if(Character.isUpperCase(ch) && !Character.isDigit(ch))  //ExcelR
			System.out.print(Character.toLowerCase(ch));
		if(Character.isLowerCase(ch) && !Character.isDigit(ch))
			System.out.print(Character.toUpperCase(ch));
		
		if(Character.isDigit(ch))
			System.out.print("*");
		
		if(Character.isSpaceChar(ch))
			System.out.print("$");
		
	}while(n!=-1);
	fin.close();
}
}
