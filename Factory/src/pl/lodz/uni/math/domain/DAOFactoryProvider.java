package pl.lodz.uni.math.domain;

import java.util.*;

import pl.lodz.uni.math.factory.IFactory;
import pl.lodz.uni.math.domain.*;

public class DAOFactoryProvider {

	IFactory instance = null;
	EInstance EInstance;
	
	Map<EInstance, IFactory> sources = new HashMap<EInstance,IFactory>();
	
	
	String getName()
	{
		return instance.getName();
	}

}
	public void setSource(EInstance) 
	{
		instance  = sources.get(
			{
			 switch (EInstance) 
			 {
			 	case XML:
				 return XML;
				 break;
					 
				case DB:
				 return DB;
				 break;
					 
				case CSV:
				 return CSV;
				 break;
					 
				default:
				 System.out.println("Wrong type");
				 break;
			 };
			};
		 );
	}

