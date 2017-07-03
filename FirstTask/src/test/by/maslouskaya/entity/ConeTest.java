package test.by.maslouskaya.entity;

import org.junit.Assert;
import org.junit.Test;

import by.maslouskaya.entity.Cone;
import by.maslouskaya.entity.Point;

public class ConeTest {
	@Test
	public void isEqual() {
		Cone c1 = new Cone(new Point(1, 2, 3), 3, 4);
		Cone c2 = new Cone(new Point(1, 2, 3), 3, 4);
		Assert.assertEquals(c1, c2);
	}
	
	@Test
	public void isNotEqual() {
		Cone c1 = new Cone(new Point(), 3, 4);
		Cone c2 = new Cone(new Point(1, 2, 3), 3, 4);
		Assert.assertNotEquals(c1, c2);
	}
}
