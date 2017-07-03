package test.by.maslouskaya.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import by.maslouskaya.entity.Cone;
import by.maslouskaya.entity.Point;
import by.maslouskaya.exception.ConeException;
import by.maslouskaya.exception.ConeParserException;
import by.maslouskaya.operation.creator.ConeCreator;
import by.maslouskaya.operation.parser.ConeParser;

@RunWith(Parameterized.class)
public class ConeCreatorTest {
	private ArrayList<Integer> param;
	private Cone cone;
	
	public ConeCreatorTest(ArrayList<Integer> str, Cone cone) {
		this.param = str;
		this.cone = cone;
	}
	
	@Parameters public static List<Object[]> TestData() throws ConeParserException {
		return Arrays.asList(new Object[][]{
			{ConeParser.parseString("0;0;0;3;4"), new Cone(new Point(), 3, 4)},
			{ConeParser.parseString("1;2;3;4;5"), new Cone(new Point(1, 2, 3), 4, 5)},
			{ConeParser.parseString("1;1;1;3;4"), new Cone(new Point(1, 1, 1), 3, 4)},
			{ConeParser.parseString("0;1;2;2;5"), new Cone(new Point(0, 1, 2), 2, 5)},
			{ConeParser.parseString("0;0;3;2;3"), new Cone(new Point(0, 0, 3), 2, 3)}
		});
	}
	
	@Test
	public void newCone() throws ConeException, ConeParserException {
		Cone expected = this.cone;
		ConeCreator creator = new ConeCreator();
		Cone actual = creator.newCone(this.param);
		Assert.assertEquals(expected, actual);
	}
}
