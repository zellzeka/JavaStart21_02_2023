package homework;

public class HomeworkThree {

	public static void main(String[] args) {
		for(int i=2; i<12; i++){
			String piStrng = String.format("%." + i + "f", Math.PI);
			System.out.println(piStrng);
		}

	}

}
