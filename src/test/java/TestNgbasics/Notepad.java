package TestNgbasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Notepad {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("D:\\for_selenium\\TestNGPrograms\\Book.properties.txt");
		Properties p = new Properties();
	    p.load(fis);
        String data1 = p.getProperty("UN");
        System.out.println(data1);
        String data2 = p.getProperty("PWD");
        System.out.println(data2);
	}

}
