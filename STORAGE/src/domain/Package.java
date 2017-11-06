package domain;

public class Package {
	public String description;
	public PackageTypes type;
	public int moves = 0;
	public String additionDate;
	public int number;
	public int priority;
	
	public Package() {
		// TODO Auto-generated constructor stub
	}
	
	public Package(String description, PackageTypes type, int moves, String additionDate, int number, int priority) {
		// TODO Auto-generated constructor stub
		
		this.description = description;
		this.type = type;
		this.moves = moves;
		this.additionDate = additionDate;
		this.number = number;
		this.priority = priority;
	}
	
}
