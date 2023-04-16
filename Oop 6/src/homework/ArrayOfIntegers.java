package homework;

import java.util.Arrays;

public class ArrayOfIntegers implements Runnable{
	private int[] randomIntegers;
	private int startArrIndex;
	private int endArrIndex;
	private long sum;
	
	public ArrayOfIntegers(int[] randomIntegers, int startArrIndex, int endArrIndex) {
		super();
		this.randomIntegers = randomIntegers;
		this.startArrIndex = startArrIndex;
		this.endArrIndex = endArrIndex;
	}

	public long getSum() {
		return sum;
	}

	public ArrayOfIntegers() {
		super();
	}

	public int[] getRandomIntegers() {
		return randomIntegers;
	}

	public void setRandomIntegers(int[] randomIntegers) {
		this.randomIntegers = randomIntegers;
	}

	public int getStartArrIndex() {
		return startArrIndex;
	}

	public void setStartArrIndex(int startArrIndex) {
		this.startArrIndex = startArrIndex;
	}

	public int getEndArrIndex() {
		return endArrIndex;
	}

	public void setEndArrIndex(int endArrIndex) {
		this.endArrIndex = endArrIndex;
	}

	@Override
	public String toString() {
		return "ArrayOfIntegers [randomIntegers=" + Arrays.toString(randomIntegers) + ", startArrIndex=" + startArrIndex
				+ ", endArrIndex=" + endArrIndex + " result=" +  partSum() + "]";
	}

	public long partSum() {
		for(int i = startArrIndex; i < endArrIndex; i++) {
			sum += randomIntegers[i];
		}
		return sum;
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		partSum();
		System.out.println(thr.getName() + " id " + thr.getId() + " Сумма элементов = " + partSum());
	}
}
