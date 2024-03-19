package day14.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileProgram3_DisplayFileContentInReverseOrder 
{
public static void main(String[] args) throws IOException {
	StringBuffer buffer=new StringBuffer("");
	FileInputStream fin=new FileInputStream("myfolder/myfile.txt");
	int n;
	do
	{
		n=fin.read();
		char ch=(char)n;
		if(n!=-1)
		buffer.append(ch);
	}while(n!=-1);
	
	buffer.reverse();
	System.out.println(buffer);
}
}
