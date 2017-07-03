package by.maslouskaya.operation.creator;

import java.util.ArrayList;

import by.maslouskaya.entity.Cone;
import by.maslouskaya.entity.Point;
import by.maslouskaya.exception.ConeException;
import by.maslouskaya.exception.ConeParserException;
import by.maslouskaya.operation.validator.ConeValidator;

public class ConeCreator {
	public Cone newCone(ArrayList<Integer> param) throws ConeParserException, ConeException {
		Point p = new Point(param.get(0), param.get(1), param.get(2));
		if(ConeValidator.isValidCone(p, param.get(3), param.get(4))) {
			return new Cone(p, param.get(3), param.get(4));
		} else {
			throw new ConeException("Invalid cone parameters!");
		}
	}
}
