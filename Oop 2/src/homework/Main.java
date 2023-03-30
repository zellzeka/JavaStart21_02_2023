package homework;

public class Main {

	public static void main(String[] args) {
		Cat murka = new Cat("Вискас", "Белый", 7, "Мурка");
		System.out.println(murka.getVoice());
		murka.eat();
		murka.sleep();
		
		Dog bobik = new Dog("Pedigree", "Черный", 15, "Бобик");
		System.out.println(bobik.getVoice());
		bobik.eat();
		bobik.sleep();
		
		Veterinarian alexDog = new Veterinarian("Александр");
		alexDog.treatment(bobik);
		
		Veterinarian alexCat = new Veterinarian("Александр");
		alexCat.treatment(murka);
	}

}
