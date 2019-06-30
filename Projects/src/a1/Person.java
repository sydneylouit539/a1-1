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
	
	/** Allows user to set name of Person
	 * 
	 * @param name a non-empty, non-null String to change this person's name
	 */
	public void setName(String name) {

		assert name != null && name != "";
		this.p_name = name;
		return;
	}
	
	/** Allows user to set birth year of Person
	 * 
	 * @param y an int representing this person's birth year
	 */
	public void setBirthYear(int y) {
		this.year = y;
	}
	
	/** Allows user to set birth month of Person
	 * 
	 * @param m an int between 1 and 12 representing this person's birth month
	 */
	public void setBirthMonth(int m) {
		assert m <= 12 && m >= 1;
		this.month = m;
	}
	
	/** Allows user to set birth day of Person
	 * 
	 * @param d an int between 1 and 31 representing this person's birth day
	 */
	public void setBirthDay(int d) {
		assert d <= 31 && d >= 1;
		this.day = d;
	}
	
	/** Allows user to set mother of Person
	 * 
	 * @param m a Person object representing this person's mother
	 */
	public void setMother(Person m) {
		if (this.mother != null) {
			mother.children -= 1;
		}
		this.mother = m;
		mother.children +=1;
	}
	
	/** Allows user to set father of Person
	 * 
	 * @param f a Person object representing this person's father
	 */
	public void setFather(Person f) {
		if (this.father != null) {
			father.children -= 1;
		}
		this.father = f;
		father.children +=1;
	}
	
	// Group C:
	
	/** Determines if Person object other shares a parent with this person
	 * 
	 * @param other a Person object
	 * @return boolean true if this person and other share a parent, false otherwise
	 */
	public boolean isHalfSibling(Person other) {
		
		assert other != null;
		// some weird OR statement error with this: return ((this.mother() | this.father()) == (other.mother() | other.father()));
		return ((this.mother() == other.mother()) | (this.father() == other.mother()) | (this.mother() == other.father()) | (this.father() == other.father()));
			
	}
	
	/**
	 * 
	 * @param other a Person object
	 * @return boolean true if this person is older than other, false otherwise
	 */
	public boolean isOlderThan(Person other) {
		
		assert other != null;
		
		// Preallocations to keep track of everything
		boolean yearOlder = (this.birthYear() < other.birthYear());
		boolean yearEqual = (this.birthYear() == other.birthYear());
		boolean monthOlder = (this.birthMonth() < other.birthMonth());
		boolean monthEqual = (this.birthMonth() == other.birthMonth());
		boolean dayOlder = (this.birthDay() < other.birthDay());
		
		return (yearOlder || (yearEqual && (monthOlder || (monthEqual && dayOlder))));
	}		
}
