package day14.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileProgram1_DisplayContentOfFileOnConsole {
public static void main(String[] args) {
	try
	{
	FileInputStream fin=new FileInputStream("myfolder/myfile.txt");
	int n;
	if(fin==null)
		System.out.println("File Not Found");
	else
	{
		do
		{
			n=fin.read();
			char ch=(char)n;
			if(n!=-1)
			System.out.print(ch);	
		}while(n!=-1);
	}
	}
	catch(FileNotFoundException e1)
	{
		System.out.println("File Does Not Exist");
	}
	catch(Exception e2)
	{
		System.out.println(e2.getMessage());
	}
}
}
