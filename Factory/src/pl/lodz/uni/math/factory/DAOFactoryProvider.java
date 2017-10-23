package pl.lodz.uni.math.factory;

import pl.lodz.uni.math.domain.Person;

public class DAOFactoryProvider {

	IFactory instance = null;
	
	String getNameO()
	{
		return instance.getName();
	}
	
}
