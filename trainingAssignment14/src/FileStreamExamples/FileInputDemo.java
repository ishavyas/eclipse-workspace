package FileStreamExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D://EmpFiles//demo.txt");
		int t = fis.read();
		while(t!=-1) {
			System.out.print((char)t);
			t= fis.read();
		}	
		fis.close();
	}

}
