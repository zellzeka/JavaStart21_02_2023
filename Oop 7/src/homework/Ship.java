package homework;

public class Ship implements Runnable {
	private String shipName;
	private String[] shipHold;
	private Port unloading;
	

	public Ship(String shipName, String[] shipHold, Port unloading) {
		super();
		this.shipName = shipName;
		this.shipHold = shipHold;
		this.unloading = unloading;
	}

	public Ship() {
		super();
	}

	public Port getUnloading() {
		return unloading;
	}

	public void setUnloading(Port unloading) {
		this.unloading = unloading;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String[] shipHold() {
		return shipHold;
	}

	public void shipHold(String[] shipHold) {
		this.shipHold = shipHold;
	}

	@Override
	public String toString() {
		return "Ship [shipName=" + shipName + ", boxQuantity=" + shipHold + "]";
	}
	
	public void unloadingProcess() {
		
	}
	
	
	@Override
	public void run() {
		if(unloading.getFirstDockStatus()) {
			unloading.setFirstDockStatus(false);
			unloading.setFirstDock(shipHold);
			System.out.println(shipName + " закончил разгрузку в первом доке");
			unloading.setFirstDockStatus(true);
		} else {
			unloading.setSecondDockStatus(false);
			unloading.setSecondDock(shipHold);
			System.out.println(shipName + " закончил разгрузку во втором доке");
			unloading.setSecondDockStatus(true);
		}
		

	}
	
	
	
}
