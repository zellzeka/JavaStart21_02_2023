package homework;

public class HomeworkOne {

	public static void main(String[] args) {
		int [] array = new int [] {2, 4, 1, 10, 8, 6};
		
		int printMax = determMax(array);
		
		System.out.println("Максимальное число указанного массива " + printMax);
		
	}
	
	public static int determMax(int[] arr) {
		int maxValue = arr[0];
		for(int val:arr) {
			if(maxValue < val) {
				maxValue = val;
			}
		}
		return maxValue;
	}
}
