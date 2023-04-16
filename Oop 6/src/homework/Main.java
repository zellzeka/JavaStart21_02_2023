package homework;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			HundredStreams task = new HundredStreams();
			Thread thread = new Thread(task);
			thread.start();
		}
		
		Random rand = new Random();
		
		int[] currentArr = new int[2000000];
		
		for(int i = 0; i < currentArr.length; i++) {
			currentArr[i] = rand.nextInt(1000);	
		}
		
		long finalSum = 0;
		ArrayOfIntegers part1 = new ArrayOfIntegers(currentArr,0,500000);
		ArrayOfIntegers part2 = new ArrayOfIntegers(currentArr,500000,1000000);
		ArrayOfIntegers part3 = new ArrayOfIntegers(currentArr,1000000,1500000);
		ArrayOfIntegers part4 = new ArrayOfIntegers(currentArr,1500000,2000000);
		
		Thread arrThread1 = new Thread(part1);
		Thread arrThread2 = new Thread(part2);
		Thread arrThread3 = new Thread(part3);
		Thread arrThread4 = new Thread(part4);
		
		arrThread1.start();
		arrThread2.start();
		arrThread3.start();
		arrThread4.start();
		
		try {
			arrThread1.join();
			arrThread2.join();
			arrThread3.join();
			arrThread4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finalSum = part1.getSum() + part2.getSum() + part3.getSum() + part4.getSum();
		System.out.println("Итоговая сумма элементов массива " + finalSum);
		
	}

}
