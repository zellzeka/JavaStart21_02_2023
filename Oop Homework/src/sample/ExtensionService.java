package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ExtensionService {
	  public static long copyFile(File in, File out) throws IOException{
		    try(InputStream is = new FileInputStream(in);
		        OutputStream os = new FileOutputStream(out)){
		      return is.transferTo(os);
		    }
	  }
	
	public static int copyFolderFiles (File folderIn, File folderOut, String requiredExtension) throws IOException {
		int counter = 0;
		File[] allFiles = folderIn.listFiles();
		for(int i = 0; i < allFiles.length; i++) {
			if (allFiles[i].isFile() && allFiles[i].getName() != null) {
				int extensionIndex = allFiles[i].getName().lastIndexOf(".");
				String fileExtension = allFiles[i].getName().substring(extensionIndex + 1);
				if(fileExtension.equals(requiredExtension)) {
					File requiredFile = new File(folderOut, allFiles[i].getName());
					copyFile(allFiles[i], requiredFile);
					counter ++;
				}
			}	
		}
		return counter;
	}

}
