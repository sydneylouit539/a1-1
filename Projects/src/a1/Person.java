package a1;

public class Person {
	
	// Initializations
	Person mother = null;
	Person father = null;
	String p_name = null;
	int year = 0;
	int month = 0;
	int day = 0;
	String[] children = null;
	
	
	public static void main(String[] args) {
		Person p = new Person("X",1,2,3);
	}
	
	// Group A: Constructors and getters:
	/**
	 * 
	 * @param name a non-empty, non-null string representing this person's name
	 * @param birthYear int representing the birth year of the person
	 * @param birthMonth int in the range [1,12] representing the birth month of the person
	 * @param birthDay int in the range [1,31] representing the birth day of the person
	 */
	public Person(String name, int birthYear, int birthMonth, int birthDay) {
		
	//Ensuring preconditions are met
		// Ensure name is not empty:
		if (name == null | name.length() == 0) {
			System.out.println("Error: person has an invalid name");
			return;
		}
		
		// Ensure birthMonth and birthDay are valid
		if (birthMonth < 1 | birthMonth > 12 | birthDay < 1 | birthDay > 31) {
			System.out.println("Error: person has an invalid birth month");
			return;
		}
		
		p_name = name;
		year = birthYear;
		month = birthMonth;
		day = birthDay;
		
	}
	
	/** return name of the person */
	public String name() {
		
		return this.p_name;
	}
	
	/** return mother of the person, null if unknown */
	public Person mother() {
		
		return this.mother;
	}
	
	/** return father of the person, null if unknown */
	public Person father() {
		
		return this.father;
	}
	
	/** return this peron's birth year */
	public int birthYear() {
		
		return this.year;
	}
	
	/** return this peron's birth month */
	public int birthMonth() {
		
		return this.month;
	}
	
	/** return this peron's birth day */
	public int birthDay() {
	
		return this.day;
	}
	
	public int numChildren() {
		
		return this.children.length;
	}
	
}
