package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ReadingStream implements Runnable {
	private File in;
	private DataExchanger exchanger;

	public ReadingStream(File in, DataExchanger exchanger) {
		super();
		this.in = in;
		this.exchanger = exchanger;
	}

	public ReadingStream() {
		super();
	}

	public File getIn() {
		return in;
	}
	
	public void setIn(File in) {
		this.in = in;
	}
	
	public long readBytesArr() {
		long bytesQuantity = 0;
		try(InputStream is = new FileInputStream(in)){
			System.out.println("Размер файла " + in.length());
			int bytesSection = (int) (in.length() / 10);
			while(bytesQuantity < in.length()) {
				byte[] downloadedBytes = is.readNBytes(bytesSection);
				exchanger.setReceivedBytes(downloadedBytes);
				System.out.println("Считано " + bytesQuantity + " байт" );
				bytesQuantity += bytesSection;
			}
			exchanger.setStop(false);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bytesQuantity;
	}

	@Override
	public void run() {
		readBytesArr();
		
	}

	
	
}
