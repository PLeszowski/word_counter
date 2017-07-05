package com.sda.word;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        CountLine countLine = new CountLine();

        System.out.println(countLine.count("file.txt"));


    }
}
