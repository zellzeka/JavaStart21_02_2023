package classwork;

public class Practice {

	public static void main(String[] args) {

	    int[] arr = new int[] { 1, 3, 6, 7, 4 };

	    int s = calculateOddSum(arr);

	    System.out.println(s);

	}
	/**
	 * Method calculate sum even element.
	 * 
	 * 
	 * @param array <code> int [] </code> reference to integer array. Not null.
	 * @return <code>int</code> sum even element
	 * @author alexander ts. email - some.mail@com
	 */
	public static int calculateOddSum(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count += array[i];
			}
		}
		return count;
	}

}
