package homework;

public class HomeworkThree {

	public static void main(String[] args) {
		int[] array = new int[] {3,2,4,15,6,31,0,10};
		int desiredValue = 6;
		
		System.out.println(linearSearch(array,desiredValue));

	}
	/**
	 * Method for linear search in an array of integers.
	 * 
	 * @param arr <code>int[]</code> array of integers to search.
	 * @param val <code>int</code> desired value.
	 * @return <code>int</code> index of the searched value in the given array
	 */
	public static int linearSearch (int[] arr, int val) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == val) {
				return i;
			}
		}
		return -1;
	}
}
