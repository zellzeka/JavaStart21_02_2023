package classwork;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String login;
	    System.out.println("Input your new login:");
	    login = sc.nextLine();

	    boolean correct = true;
	    String tempLogin = login.toLowerCase();

	    if (login.length() <= 6) {
	      correct = false;
	    } else if (!(tempLogin.charAt(0) >= 'a' && tempLogin.charAt(0) <= 'z')) {
	      correct = false;
	    } else {
	      char[] symbols = tempLogin.toCharArray();
	      for (int i = 0; i < symbols.length; i++) {
	        char s = symbols[i];
	        if (!((s >= 'a' && s <= 'z') || (s >= '0' && s <= '9') || s == '_')) {
	          correct = false;
	          break;
	        }
	      }
	    }
	    if (correct) {
	      System.out.println(login + " correct");
	    } else {
	      System.out.println(login + " uncorrect");
	    }

	}

}
