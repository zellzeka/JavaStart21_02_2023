package homework;

import java.io.File;

public class HomeworkThree {

	public static void main(String[] args) {
		File dirAddress = new File(".");
		scanDir(dirAddress);

	}
	
	public static void scanDir (File file) {
		if(file.isDirectory()) {
			for(File item:file.listFiles()) {
				if(item.isDirectory()) {
					System.out.println(item.getName());
					scanDir(item);
				} else {
					continue;
				}
			}
		}
	}
}
