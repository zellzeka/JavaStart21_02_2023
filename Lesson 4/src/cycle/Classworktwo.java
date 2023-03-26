package cycle;

import java.util.Scanner;

public class Classworktwo {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int h;
	    System.out.println("Input h");
	    h = sc.nextInt();

	    for (int i = 1; i <= h; i++) {
	      for (int j = 1; j <= h; j++) {
	        if (j <= h - i) {
	          System.out.print(" ");
	        } else {
	          System.out.print("*");
	        }
	      }
	      System.out.println();
	    }
	  }
	}
