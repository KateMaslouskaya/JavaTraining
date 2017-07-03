package test.by.maslouskaya.operation;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import by.maslouskaya.exception.ConeParserException;
import by.maslouskaya.operation.parser.ConeParser;

public class ConeParserTest {
	@Test
	public void parseValidStringTest() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		ArrayList<Integer> actual = null;
		try {
			actual = ConeParser.parseString("1;2;3;4;5");
		} catch (ConeParserException e) {
			Assert.fail(e.getMessage());
		}
		Assert.assertEquals(expected, actual); 
	}
	
	@Test
	public void parseInvalidString1Test() {
		try {
			ConeParser.parseString("1;2;3;4");
		} catch (ConeParserException e) {
			Assert.assertEquals("Incorrect number of parameters!", e.getMessage());
		}
	}
	
	@Test
	public void parseInvalidString2Test() {
		try {
			ConeParser.parseString("1;2;3;4;y");
		} catch (ConeParserException e) {
			Assert.assertEquals("Incorrect parameter type!", e.getMessage());
		}
	}
}
