package homework;

import java.util.Arrays;
import java.util.Random;

public class HomeworkThree {

	public static void main(String[] args) {
		Random rn = new Random();
		int [] array = new int[15];	
		int [] secondArray = Arrays.copyOf(array, array.length * 2);
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(1,10);
			secondArray[i] = array[i];
			secondArray[array.length + i] = array[i] * 2;
		}
		
		System.out.println(Arrays.toString(secondArray));

	}

}
