package classwork;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int price1;
    int price2;
    int price3;
    int maxPrice;

    System.out.println("Input price 1");
    price1 = sc.nextInt();

    System.out.println("Input price 2");
    price2 = sc.nextInt();

    System.out.println("Input price 3");
    price3 = sc.nextInt();

    maxPrice = price1;

    if (price2 > maxPrice) {
      maxPrice = price2;
    }
    if (price3 > maxPrice) {
      maxPrice = price3;
    }
    
    System.out.println("Max price = " + maxPrice + " UAH");

  }
}