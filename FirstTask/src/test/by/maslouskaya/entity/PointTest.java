package test.by.maslouskaya.entity;

import org.junit.Assert;
import org.junit.Test;

import by.maslouskaya.entity.Point;

public class PointTest {
	@Test
	public void isEqual() {
		Point p1 = new Point(1, 2, 3);
		Point p2 = new Point(1, 2, 3);
		Assert.assertEquals(p1, p2);
	}
	
	@Test
	public void isNotEqual() {
		Point p1 = new Point();
		Point p2 = new Point(1, 2, 3);
		Assert.assertNotEquals(p1, p2);
	}
}
