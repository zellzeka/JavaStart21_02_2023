package homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.OutputStream;

public class WritingStream implements Runnable {
	private File out;
	private DataExchanger exchanger;
	
	public WritingStream(File out, DataExchanger exchanger) {
		super();
		this.out = out;
		this.exchanger = exchanger;
	}

	public WritingStream() {
		super();
	}

	public File getOut() {
		return out;
	}

	public void setOut(File out) {
		this.out = out;
	}

	public DataExchanger getExchanger() {
		return exchanger;
	}

	public void setExchanger(DataExchanger exchanger) {
		this.exchanger = exchanger;
	}

	@Override
	public String toString() {
		return "WritingStream [out=" + out + ", exchanger=" + exchanger + "]";
	}

	@Override
	public void run() {
		try (OutputStream os = new FileOutputStream(out, true)) {
			while(exchanger.isStop() == true) {
				byte[] writtenBytes = exchanger.getReceivedBytes();
				os.write(writtenBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}
