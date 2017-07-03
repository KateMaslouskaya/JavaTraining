package test.by.maslouskaya.operation;

import org.junit.Assert;
import org.junit.Test;

import by.maslouskaya.entity.Cone;
import by.maslouskaya.entity.Point;
import by.maslouskaya.operation.validator.ConeValidator;

public class ConeValidatorTest {
	@Test
	public void validPoint() {
		Point point = new Point();
		Assert.assertTrue(ConeValidator.isValidPoint(point));
	}
	
	@Test
	public void invalidPoint() {
		Point point = null;
		Assert.assertFalse(ConeValidator.isValidPoint(point));
	}
	
	@Test
	public void validCone() {
		Point point = new Point();
		int radius = 2;
		int height = 3;
		Assert.assertTrue(ConeValidator.isValidCone(point, radius, height));
	}
	
	@Test
	public void invalidCone() {
		Point point = new Point();
		int radius = 0;
		int height = 3;
		Assert.assertFalse(ConeValidator.isValidCone(point, radius, height));
	}
	
	@Test
	public void coneOnXYPlane () {
		Point p = new Point();
		Cone cone = new Cone(p, 3, 4);
		Assert.assertTrue(ConeValidator.isConeOnXYPlane(cone));
	}
	
	@Test
	public void coneNotOnXYPlane () {
		Point p = new Point(1, 2, 3);
		Cone cone = new Cone(p, 3, 4);
		Assert.assertFalse(ConeValidator.isConeOnXYPlane(cone));
	}
}
