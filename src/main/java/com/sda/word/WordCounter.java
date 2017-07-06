package com.sda.word;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by RENT on 2017-07-05.
 */
public class WordCounter implements Countable {

	@Override
	public int count(String filePath) throws IOException {

		List<String> lines = Files.readAllLines(Paths.get(filePath));

		return lines.stream().map(line -> line.split("\\s+")).mapToInt(word -> word.length).sum();

	}
}