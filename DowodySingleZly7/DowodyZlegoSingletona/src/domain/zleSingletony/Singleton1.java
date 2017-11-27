package domain.zleSingletony;

public class Singleton1 {

	int value;
	private static Singleton1 Instance = null;
	
	private Singleton1()
	{
		
	}
	
	public static Singleton1 getInstance()
	{
		if(Instance == null)
		{
			Instance = new Singleton1();
		}
		
		return Instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		
		if(s1 == s2)
		{
			System.out.printf("Rowne");
		}
		

	}

}
