package day14.filehandling;

import java.io.File;

public class FileProgram4_DeleteAllTxtFiles {
public static void main(String[] args) {
	
	String fileNames[]= {"myfolder/abc.html","myfolder/myfile.txt","myfolder/myfile1.txt","myfolder/sakshi_style.css","myfolder/Soups.jpg"};
	
	for(String fileName:fileNames)
	{
		File myFile=new File(fileName);
		if(fileName.endsWith(".txt"))
		{
			System.out.println("FileName " + myFile.getAbsoluteFile());
			System.out.println("FilePath" +myFile.getAbsolutePath());
			System.out.println("File Length" +myFile.length()+ "bytes");
			
			myFile.delete();
			System.out.println(fileName + "is Deleted");
		}
	}
}
}
