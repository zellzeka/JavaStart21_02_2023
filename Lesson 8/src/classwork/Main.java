package classwork;

import java.io.File;

public class Main {

	public static void main(String[] args) {
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
