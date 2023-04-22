package homework;

import java.util.Arrays;

public class Port {
	private String[] firstDock;
	private String[] secondDock;
	private Boolean firstDockStatus = true;
	private Boolean secondDockStatus = true;
	private Boolean portStatus = true;
	
	public Port(String[] firstDock, String[] secondDock) {
		super();
		this.firstDock = firstDock;
		this.secondDock = secondDock;
	}

	public Port() {
		super();
	}

	public void setFirstDockStatus(Boolean firstDockStatus) {
		this.firstDockStatus = firstDockStatus;
	}

	public void setSecondDockStatus(Boolean secondDockStatus) {
		this.secondDockStatus = secondDockStatus;
	}

	public void setPortStatus() {
		while((!firstDockStatus) && (!secondDockStatus)) {
			portStatus = false;
			try {
				wait();
				System.out.println("Все доки заняты");
			} catch (InterruptedException e) {
			}
		}
		notifyAll();
	}

	public Boolean getFirstDockStatus() {
		return firstDockStatus;
	}

	public Boolean getSecondDockStatus() {
		return secondDockStatus;
	}

	public Boolean getPortStatus() {
		return portStatus;
	}

	public String[] getFirstDock() {
		return firstDock;
	}

	public synchronized void setFirstDock(String[] firstDock) {
		setPortStatus();
		System.out.println("Корабль начал разгрузку в первом доке");
		unloadingMethod(this.firstDock, firstDock);	
	}

	public String[] getSecondDock() {
		return secondDock;
	}

	public synchronized void setSecondDock(String[] secondDock){
		setPortStatus();
		System.out.println("Корабль начал разгрузку во втором доке");
		unloadingMethod(this.secondDock, secondDock );
	}
	
	public void unloadingMethod (String[] freeDock, String[] shipCargo) {
		Thread thr  = Thread.currentThread();

		for(int i = 0; i < shipCargo.length; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			freeDock[i] = shipCargo[i];
			System.out.println((i + 1) + " ящик разгружен " + "Поток - " + thr.getId());
		}
	}

	@Override
	public String toString() {
		return "Port [firstDock=" + Arrays.toString(firstDock) + ", secondDock=" + Arrays.toString(secondDock) + "]";
	}
	

}
