package classwork;

import java.util.Scanner;

public class SecondHomework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entranceQuantity = 5;
		int floorsQuantity = 9;
		int apartmentsOnfloor = 4;
		int entranceApartments = apartmentsOnfloor * floorsQuantity;
		int totalApartments = entranceApartments * entranceQuantity;
		
		System.out.println("Введите номер квартиры");
		int apartmentNumber = sc.nextInt();
		
		int floorNumber = (apartmentNumber - 1) % entranceApartments / apartmentsOnfloor + 1;
		int entranceNumber = (apartmentNumber - 1) / entranceApartments + 1;
		
		if (apartmentNumber <= 0 || apartmentNumber >= totalApartments) {
			System.out.println("Такой квартиры в этом доме нет");
		} else {
			System.out.println("Квартира находится на " + floorNumber + " этаже " + entranceNumber + " подъезда");
		}

	}

}
