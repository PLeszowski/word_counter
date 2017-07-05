package com.sda.word;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {


		CharacterCounter cc = new CharacterCounter();

		System.out.println("Number of characters: " + cc.count("file.txt"));

		//WordCounter wc = new WordCounter();

		//System.out.println("Number of words: " + wc.count("file.txt"));

    }
}
