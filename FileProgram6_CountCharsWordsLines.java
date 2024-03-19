package day14.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileProgram6_CountCharsWordsLines {
public static void main(String[] args) throws Exception {
	FileInputStream fin=new FileInputStream("myfolder/myfile2.txt");
	int n;
	int charCounter=0;
	int wordCounter=0;
	int LinesCounter=0;
	char ch;
	do
	{
		n=fin.read();
		ch=(char)n;
		if(n!=-1)
		{
			charCounter++;
			if(ch=='\n')
			LinesCounter++;
			if(n==32 || n==9 ||n==10)  //space=32 tab=9 enter=10
			wordCounter++;
		}
	}while(n!=-1);
	
	System.out.println("Number Of Chars "+charCounter);
	System.out.println("Number Of Lines "+(LinesCounter+1));
	System.out.println("Number Of Words "+(wordCounter+1));
}
}
