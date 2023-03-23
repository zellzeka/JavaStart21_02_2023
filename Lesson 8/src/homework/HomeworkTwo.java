package homework;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class HomeworkTwo {

	public static void main(String[] args) {	
		int[][] array = new int [][] {{56, 13, 2, 55, 62}, {4, 8, 45, 74, 84}};
		File arrayFile = new File("array.txt");
		printArray(arrayFile, array);
	}
	
	public static void printArray (File file, int[][] arr) {
		try (PrintWriter pw = new PrintWriter(file)){
			String stringArray = Arrays.deepToString(arr);
			pw.println(stringArray);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
