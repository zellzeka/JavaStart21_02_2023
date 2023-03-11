package homework;

public class HomeworkOne {

	public static void main(String[] args) {
		int[] array = new int[] {0,5,2,4,7,1,3,19};
		int counter = 0;
		
		for(int elemet:array) {
			if(!(elemet % 2 == 0)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
