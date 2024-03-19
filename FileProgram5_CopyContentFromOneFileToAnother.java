package day14.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileProgram5_CopyContentFromOneFileToAnother {
public static void main(String[] args) throws Exception
{
	FileInputStream fin=new FileInputStream("myfolder/myfileIn.txt");
	FileOutputStream fout=new FileOutputStream("myfolder/myfileOut.txt");
	int n;
	char ch;
	do
	{
		n=fin.read();
		ch=(char)n;
		if(n!=-1)
		{
			if(Character.isUpperCase(ch) && !Character.isDigit(ch))  //ExcelR
				fout.write(Character.toLowerCase(ch));
			if(Character.isLowerCase(ch) && !Character.isDigit(ch))
				fout.write(Character.toUpperCase(ch));
			
			if(Character.isDigit(ch))
				fout.write('*');
			
			if(Character.isSpaceChar(ch))
				fout.write('$');
		}
	}while(n!=-1);
	
}
}
