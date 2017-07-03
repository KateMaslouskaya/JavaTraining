package by.maslouskaya.operation.validator;

import by.maslouskaya.entity.Cone;
import by.maslouskaya.entity.Point;

public class ConeValidator {
	public static boolean isValidPoint(Point point) {
		return point != null;
	}
	
	public static boolean isValidCone(Point point, int radius, int height) {
		return point != null && radius > 0 && height > 0;
	}
	
	public static boolean isConeOnXYPlane(Cone cone) {
		return cone.getCenter().getZ() == 0;
	}
	
	/*public static boolean isValidCone(Cone cone) {
		if(cone != null){
			return cone.getCenter() != null && cone.getRadius() > 0 && cone.getHeight() > 0;
		} else {
			return false;
		}
	}*/
}
