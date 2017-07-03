package by.maslouskaya.operation.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import by.maslouskaya.exception.ConeReaderException;

public class ConeReader {
	static {
		new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
	}
	
	final static Logger log = Logger.getLogger(ConeReader.class);
	
	public static ArrayList<String> readFromFile(String fileName) throws ConeReaderException{
		BufferedReader br = null;
		ArrayList<String> coneList = new ArrayList<>();
		log.info("Reading file " + fileName);
		try {
			FileReader fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) != null){
				coneList.add(str);
			}
			log.info(coneList.size() + " lines were processed");
		} catch (IOException e){
			throw new ConeReaderException("File can't be processed!", e);
		} finally {
			if (br != null){
				try {
					br.close();
				} catch (IOException e){
					log.warn("File can't be closed!");
				}
			}
		}
		if(!coneList.isEmpty()) {
			return coneList;
		} else {
			throw new ConeReaderException("File is empty!");
		}
	}
}