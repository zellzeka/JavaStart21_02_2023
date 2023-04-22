package homework;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] cargo = new String[10];
//		for(int i = 0; i < cargo.length; i++) {
//			cargo[i] = "Ящик " + (i + 1);
//		}
//		
//		String[] initialStoreContent = new String[20];
//		for(int i = 0; i < initialStoreContent.length; i++) {
//			initialStoreContent[i] = "empty";
//		}
//		Port destinationPort = new Port(initialStoreContent, initialStoreContent);
//		
//		
//		Ship firstShip = new Ship("Первый Корабль",cargo, destinationPort);
//		Ship secondShip = new Ship("Второй Корабль",cargo, destinationPort);
//		Ship thirdShip = new Ship("Третий Корабль",cargo, destinationPort);
//		
//		Thread thread1 = new Thread(firstShip);
//		Thread thread2 = new Thread(secondShip);
//		Thread thread3 = new Thread(thirdShip);
//		
//		thread1.start();
//		thread2.start();
//		thread3.start();
		
		
		
//		File in = new File("I://фото//Digital Camera Photos//DSC00423.JPG");  
//	    File out = new File(in.getName());
//	    
//	    try {
//			out.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
//	    DataExchanger de = new DataExchanger();
//	    ReadingStream rs = new ReadingStream(in, de);
//	    WritingStream ws = new WritingStream(out,de);
//	    
//	    Thread tr = new Thread(rs);
//	    Thread tr2 = new Thread(ws);
//	    
//	    tr.start();
//	    tr2.start();
		
		
		
		File directory = new File("C://Users//zeleb//Desktop//portfolio-step-1");
		String fileName = "index.html";
		SearchSystem newSearch = new SearchSystem(directory, fileName);
		
		Thread stream = new  Thread(newSearch);
		stream.start();
		
		
		

	}

}
