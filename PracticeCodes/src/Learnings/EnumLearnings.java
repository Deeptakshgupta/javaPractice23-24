package Learnings;

// enum not have it's fields but 
//also methods and constructor

enum color{
	//fields => static and final implicitly
	RED, GREEN, BLUE, BLACK ;
	
	// constructor => it's private
	private color()
	{
		System.out.println("constructor for each field "+ this.toString());
	}
	
	// method
	public void print()
	{
		System.out.println(this + " at index :"+ this.ordinal());
	}
	// ordinal => position at which the field is present in Enum
	/*
	 Returns the ordinal of this enumeration constant (its position in its enum declaration, 
	 where the initial constant is assigned an ordinal of zero). 
	*/
}

public class EnumLearnings {

	public static void main(String[] args) {
		
		for(color c: color.values())
			c.print();
		
	}
}
