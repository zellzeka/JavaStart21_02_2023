package homework;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("links.txt");
		
		try {
			System.out.println(WebService.getLinks("https://master-style.com.ua/ua/vorota-all-2/viezdnie-vorota-2", file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file1 = new File("URLs.txt");
		
		
		try {
			WebService.checkStatus(file1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
