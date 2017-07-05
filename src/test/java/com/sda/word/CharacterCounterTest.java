package com.sda.word;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-07-05.
 */
public class CharacterCounterTest {

	CharacterCounter cc;

	@Before
	public void setUp() throws Exception {
		cc = new CharacterCounter();
	}

	@Test
	public void shouldThrowExceptionWhenFileNotFound() {

		try {cc.count("nofile.txt");
			Assert.fail();
		} catch (IOException e){}
	}

	@Test
	public void shouldReturnZeroForEmptyFile() throws IOException {

		int actual = cc.count("empty.txt");

		Assert.assertEquals(0,actual);

	}

	@Test
	public void shouldReturnOneForSingleCharacterFile() throws IOException {

		int actual = cc.count("singlechar.txt");

		Assert.assertEquals(1,actual);

	}

	@Test
	public void shouldReturnOneForSingleCharacterFileWithMultipleWhiteSpace() throws IOException {

		int actual = cc.count("singlechar_with_whitespace.txt");

		Assert.assertEquals(1,actual);

	}

	@Test
	public void shouldReturn10ForFileWith10CharsOnSeperateLines() throws IOException {

		int actual = cc.count("ten_chars_on_seperate_lines.txt");

		Assert.assertEquals(10,actual);

	}

	@Test
	public void shouldReturn20ForFileWith5FourCharacterWords() throws IOException {

		int actual = cc.count("five_words_w_4_characters_each.txt");

		Assert.assertEquals(20,actual);

	}
}