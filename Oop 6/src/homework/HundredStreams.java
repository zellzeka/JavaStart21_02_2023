package homework;

import java.math.BigInteger;

public class HundredStreams implements Runnable{
	private long streamNumber;
	
	public HundredStreams() {
		super();
	}

	public long getStreamNumber() {
		return streamNumber;
	}
	
	public BigInteger calculationFactorial () {
		BigInteger factorial = BigInteger.ONE;
		for(int i = 2; i < streamNumber; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		streamNumber = thr.getId();
		BigInteger currentFactorial = calculationFactorial ();
		System.out.println(thr.getName() + " id " + thr.getId() + " != " + currentFactorial);
	}	
	
}
