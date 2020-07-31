package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String s = "abcdefghijklmnopqrstuvwxyz";
	Random random = new Random();
	char c = (char)(random.nextInt(26)+'a');
		System.out.println("Guess the letter");

	while(true) {

		Scanner scanner = new Scanner(System.in);
		String ent = scanner.nextLine();
		char en = ent.charAt(0);
		if (smallLetter(en) == false) {
			System.out.println("Write small letter on English Language");
			continue;
		}
		if (en > c) {
			System.out.println("You're too high");
		}
		else if (en < c) {
			System.out.println("You're too low");
		}
		else if (en == c) {
			System.out.println("You're win");
			return;
		}
	}
    }
    static boolean smallLetter(char en) {
    	char[] ch = {'a','b','c','d','f','e','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    	for (int i = 0; i < ch.length; i++) {
    		if (ch[i] == en) {
    			return true;
			}
		}
    	return false;
	}
}
