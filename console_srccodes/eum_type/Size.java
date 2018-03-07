package myEnumType;

public enum Size {
	SMALL("S", 10), MEDIUM("M", 12), LARGE("L", 15), EXTRA_LARGE("XL", 5);
	
	
	private String abbreviation;
	private int count;
	
	// Constructor
	private Size(String abbreviation, int count )
	{
		this.abbreviation = abbreviation;
		this.count = count;
	}
	 
	// Returning information (Accessor)
	public String getAbb(){
		return this.abbreviation;
	}
	
	public int getCount(){
		return this.count;
	}
	
	// reduce count by one
	public void reduceOne(){
		this.count = this.count - 1;
	}
}
