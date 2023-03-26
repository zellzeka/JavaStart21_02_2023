package classwork;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	    Random rn = new Random();

	    int[] pay = new int[12];
	    for (int i = 0; i < pay.length; i++) {
	      pay[i] = rn.nextInt(30000, 40000);
	    }
	    System.out.println(Arrays.toString(pay));

	    int sum = 0;
	    for (int i = 0; i < pay.length; i++) {
	      sum += pay[i];
	    }
	    System.out.println("average = " + sum / pay.length);

	}

}
