package com.sda.word;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by RENT on 2017-07-05.
 */
public class CharacterCounter implements Countable {

	@Override
	public int count(String filePath) throws IOException {

		List<String> lines = Files.readAllLines(Paths.get(filePath));

		return lines.stream().map(line -> line.split("\\s+")).mapToInt(this::countCharacters).sum();
		//return lines.stream().mapToInt(String::length).sum();

	}


	private int countCharacters (String[] array){

		return Arrays.stream(array).mapToInt(String::length).sum();
	}
}
