package homework;

import java.util.Arrays;

public class DataExchanger {
	private byte[] receivedBytes;
	private boolean turn = true;
	private boolean stop = true;
	
	public DataExchanger() {
		super();
	}

	public synchronized byte[] getReceivedBytes() {
		while(turn) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		byte[] transferredBytes = this.receivedBytes;
		turn = true;
		notifyAll();
		return transferredBytes;
	}

	public synchronized void setReceivedBytes(byte[] downloadedBytes) {
		while(!turn) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.receivedBytes = downloadedBytes;
		turn = false;
		notifyAll();
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public String toString() {
		return "DataExchanger [receivedBytes=" + Arrays.toString(receivedBytes) + ", turn=" + turn + ", stop="
				+ stop + "]";
	}
	
	
	
	

}
