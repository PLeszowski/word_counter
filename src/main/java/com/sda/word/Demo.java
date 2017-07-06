package com.sda.word;

import java.io.IOException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws IOException {

		String filePath;

		Countable lineCounter = new LineCounter();
		Countable charCounter = new CharacterCounter();
		Countable wordCounter = new WordCounter();


		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide path to file");

		filePath = scanner.nextLine();

        System.out.println("Number of lines: " + lineCounter.count(filePath));
		System.out.println("Number of chars: " + charCounter.count(filePath));
		System.out.println("Number of words: " + wordCounter.count(filePath));

    }
}
