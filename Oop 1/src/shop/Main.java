package shop;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ноутбук");
		Stores laptop = new Stores(14000, "Екран 15.6\" TN / AMD Athlon Silver 3050U (2.3 - 3.2 ГГц) / RAM 8 ГБ / SSD 256 ГБ / сірий", 1.6);
		System.out.println(laptop);
		laptop.setPrice(13999);
		System.out.println(laptop.getPrice());
		
		System.out.println("Веб камера");
		Stores webCam = new Stores(535, "Web-camera 720 1280х720 Чорна з вбудованим мікрофоном кріплення на прищіпці", 0.1);
		System.out.println(webCam);
		webCam.setWeight(0.150);
		System.out.println(webCam.getWeight());
		
		System.out.println("Роутер");
		Stores router = new Stores(1400, "Швидкість Wi-Fi, 1200 Мбіт/с", 0.3);
		System.out.println(router);

	}

}
