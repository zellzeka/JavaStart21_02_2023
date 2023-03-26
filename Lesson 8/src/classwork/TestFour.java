package classwork;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFour {

	public static void main(String[] args) {
//	    String[] goods = new String[] { "Snikers", "Mars", "Twix", "Tea", "Baunti" };
//	    int[] prices = new int[] { 30, 30, 25, 40, 30 };
//	    int[] count = new int[] { 100, 80, 90, 20, 50 };
	//
	    File file = new File("report.csv");
	    String del = ",";

//	    saveToCSVfile(file, del, goods, prices, count);
	    
	    String temp = getStringFromFile(file);
	    
	    System.out.println(temp);
	  }

	  public static void saveToCSVfile(File file, String del, String[] goods, int[] prices, int[] count) {
	    try (PrintWriter pw = new PrintWriter(file)) {
	      for (int i = 0; i < goods.length; i++) {
	        pw.println(goods[i] + del + prices[i] + del + count[i]);
	      }

	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }

	  public static String getStringFromFile(File file) {
	    String result = "";
	    try (Scanner sc = new Scanner(file)) {

	      for (; sc.hasNextLine();) {
	        result += sc.nextLine() + System.lineSeparator();
	      }

	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    return result;

	}

}
