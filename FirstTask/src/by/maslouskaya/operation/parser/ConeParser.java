package by.maslouskaya.operation.parser;

import java.util.ArrayList;

import by.maslouskaya.exception.ConeParserException;

public class ConeParser {
	private final static char DELIMITER = ';';
	
	public static ArrayList<Integer> parseString (String str) throws ConeParserException {
		String temp[] = str.split(String.valueOf(DELIMITER));
		if(temp.length != 5) {
			throw new ConeParserException("Incorrect number of parameters!");
		}
		ArrayList<Integer> param = new ArrayList<Integer>();
		try {
			for(int i = 0; i < temp.length; i++) {
				param.add(Integer.parseInt(temp[i]));
			}
		}
		catch(NumberFormatException e) {
			throw new ConeParserException("Incorrect parameter type!", e);
		}
		return param;
	}
}
