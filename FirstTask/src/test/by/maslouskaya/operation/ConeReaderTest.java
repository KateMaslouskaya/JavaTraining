package test.by.maslouskaya.operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import by.maslouskaya.exception.ConeReaderException;
import by.maslouskaya.operation.reader.ConeReader;

public class ConeReaderTest {
	private static File emptyFile;
	private static File file;
	@ClassRule
	public static final TemporaryFolder folder = new TemporaryFolder();
	
	@BeforeClass
	public static void initConeReaderTest() throws IOException {
		emptyFile = folder.newFile("EmptyFile.txt");
		file = folder.newFile("TestData.txt");
		FileWriter fw = new FileWriter(file);
		fw.append("0;0;0;3;5\n");
		fw.append("1;2;0;3;5\n");
		fw.append("3;0;0;2;4");
		fw.flush();
		fw.close();
	}
	
	@Test (expected = ConeReaderException.class)
	public void readFromEmptyFileTest() throws ConeReaderException {
		ConeReader.readFromFile(emptyFile.getAbsolutePath());
	}
	
	@Test (expected = ConeReaderException.class)
	public void readFromMissingFileTest() throws ConeReaderException {
		ConeReader.readFromFile("A:\\MissingFile.txt");
	}
	
	@Test
	public void readFromFileTest() {
		ArrayList<String> expected = new ArrayList<>();
		expected.add("0;0;0;3;5");
		expected.add("1;2;0;3;5");
		expected.add("3;0;0;2;4");
		ArrayList<String> actual = new ArrayList<>();
		try {
			actual = ConeReader.readFromFile(file.getAbsolutePath()); 
		} catch (ConeReaderException e) {
			Assert.fail(e.getMessage());
		}
		Assert.assertEquals(expected, actual); 
	}
}
