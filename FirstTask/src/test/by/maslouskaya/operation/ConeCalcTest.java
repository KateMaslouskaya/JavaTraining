package test.by.maslouskaya.operation;

import org.junit.Assert;
import org.junit.Test;

import by.maslouskaya.operation.calc.ConeCalc;

public class ConeCalcTest {
	@Test
	public void surfaceAreaTest(){
		int radius = 3;
		int height = 4;
		double expected = 75.3982;
		double actual = ConeCalc.surfaceArea(radius, height);
		Assert.assertEquals(expected, actual, 0.0001);
	}
	
	@Test
	public void volumeTest(){
		int radius = 3;
		int height = 4;
		double expected = 37.6991;
		double actual = ConeCalc.volume(radius, height);
		Assert.assertEquals(expected, actual, 0.0001);
	}
}
