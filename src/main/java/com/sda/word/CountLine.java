package com.sda.word;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CountLine implements Countable {
    @Override
    public int count(String filePath) throws IOException {


        List<String> counterLines = Files.readAllLines(Paths.get(filePath));
        return (int) counterLines.stream().count();

    }
}
