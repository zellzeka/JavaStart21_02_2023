package classwork;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		File file1 = new File("a.txt");
	    
	    try {
	      file1.createNewFile();
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }

	    File workFolder = new File(".");

	    File[] files = workFolder.listFiles();
	    for (int i = 0; i < files.length; i++) {

	      String type = "File";
	      if (files[i].isDirectory()) {
	        type = "Folder";
	      }

	      System.out.println(files[i] + "   " + type + "   " + files[i].length());
	    }

	}

}
