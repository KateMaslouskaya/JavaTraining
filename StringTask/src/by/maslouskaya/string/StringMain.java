package by.maslouskaya.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StringMain {
	private final static String FILE_NAME = "./TestData/string.txt";
	
	public static void main(String[] args) {
		BufferedReader br = null;
		TreeMap<String, Integer> words = new TreeMap<>();
		try {
			FileReader fr = new FileReader(FILE_NAME);
			br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) != null){
				String temp[] = str.replaceAll("[^ A-Za-z]", "").split(String.valueOf(" "));
				for(int i = 0; i < temp.length; i++) {
					Integer v = words.get(temp[i].toLowerCase());
					if(v != null) {
						words.put(temp[i].toLowerCase(), ++v);
					} else if(temp[i].length() > 0) {
						words.put(temp[i].toLowerCase(), 1);
					}
				}
			}
		} catch (IOException e){
			System.out.println("File can't be processed!");
		} finally {
			if (br != null){
				try {
					br.close();
				} catch (IOException e){
					System.out.println("File can't be closed!");
				}
			}
		}
		System.out.println("[WORD FROM FILE -> COUNT]");
		for(Map.Entry<String,Integer> entry : words.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
