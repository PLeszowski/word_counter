package com.sda.word;

import java.io.IOException;

/**
 * Created by RENT on 2017-07-05.
 */
public interface Countable {

	int count(String filePath) throws IOException;
}
