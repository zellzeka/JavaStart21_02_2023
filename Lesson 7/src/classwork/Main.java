package classwork;

public class Main {

	public static void main(String[] args) {
	    int[] arr = new int[] { 2, -15, 7 };

	    int s = calculateSum(arr);

	    System.out.println(s);

	}
    public static int calculateSum(int[] array) {
	    int sum = 0;
	    for (int i = 0; i < array.length; i++) {
	      sum = sum + array[i];
	    }
	    return sum;
	}

}
