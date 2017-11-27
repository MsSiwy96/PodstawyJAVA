package domain.zleSingletony;


public class Singleton2 {

	int value2;
	private static Singleton2 Instance2 = null;
	
	private Singleton2()
	{
		
	}
	
	public static Singleton2 getInstance()
	{
		if(Instance2 == null)
		{
			synchronized(Instance2)
			{
				if(Instance2 == null)
				{
					Instance2 = new Singleton2();
				}
			}
		}
		
		return Instance2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
