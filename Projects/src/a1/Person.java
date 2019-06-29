package a1;

//import java.util.ArrayList;

public class Person {
	
	// Initializations
	Person mother = null;
	Person father = null;
	String p_name = null;
	int year = 0;
	int month = 0;
	int day = 0;
	int children = 0;
	
		
	// Group A: Constructors and getters:
	/**
	 * 
	 * @param name a non-empty, non-null string representing this person's name
	 * @param birthYear int representing the birth year of the person
	 * @param birthMonth int in the range [1,12] representing the birth month of the person
	 * @param birthDay int in the range [1,31] representing the birth day of the person
	 */
	public Person(String name, int birthYear, int birthMonth, int birthDay) {
		
		// Assert preconditions
		assert name != null && name != "";
		assert birthMonth <= 12 && birthMonth > 0;
		assert birthDay <= 31 && birthDay > 0;
		// Define all variables
		this.p_name = name;
		this.year = birthYear;
		this.month = birthMonth;
		this.day = birthDay;	
		
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
	
	/** return this person's birth year */
	public int birthYear() {
		return this.year;
	}
	
	/** return this person's birth month */
	public int birthMonth() {
		return this.month;
	}
	
	/** return this person's birth day */
	public int birthDay() {
		return this.day;
	}
	
	/** return the number of children of this person */
	public int numChildren() {
		return this.children;
	}
	
	// Group B: Setters
	
	public void setName(String name) {

		assert name != null && name != "";
		this.p_name = name;
		return;
	}
	
	public void setBirthYear(int y) {
		this.year = y;
	}
	
	public void setBirthMonth(int m) {
		assert m <= 12 && m >= 1;
		this.month = m;
	}
	
	public void setBirthDay(int d) {
		assert d <= 31 && d >= 1;
		this.day = d;
	}
	
	public void setMother(Person m) {
		if (this.mother != null) {
			mother.children -= 1;
		}
		this.mother = m;
		mother.children +=1;
	}
	
	public void setFather(Person f) {
		if (this.father != null) {
			father.children -= 1;
		}
		this.father = f;
		father.children +=1;
	}
	
	// Group C:
	
	public boolean isHalfSibling(Person other) {
		
		assert other != null;
		// some weird OR statement error with this: return ((this.mother() | this.father()) == (other.mother() | other.father()));
		return ((this.mother() == other.mother()) | (this.father() == other.mother()) | (this.mother() == other.father()) | (this.father() == other.father()));
			
	}
	
	public boolean isOlderThan(Person other) {
		
		return (365 * other.birthYear() + 30 * other.birthMonth() + other.birthDay()) < 
				(365 * this.birthYear()+ 30 * this.birthMonth() + this.birthDay());
		
	}
	
	
			
}
