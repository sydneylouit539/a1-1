package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void getNameTest() {
		// Valid name
		Person p = new Person("guy 1", 1990, 2, 7);
		String n = p.name();
		assertEquals(n, "guy 1");
		// Invalid name (empty string)
		try {
			Person p2 = new Person("", 1990, 2, 7);
	        fail("Expected an error");
	    } catch (AssertionError anError) {
	    	System.out.println("Error: string empty");
	    }
		// Invalid name (null)
		try {
			Person p3 = new Person(null, 1990, 2, 7);
	        fail("Expected an error");
	    } catch (AssertionError anError) {
	    	System.out.println("Error: string null");
	    }
		
	}
	
	// Testing get and set mother
	@Test
	void motherTest() {
		Person p = new Person("guy 1", 1990, 2, 7);
		Person m = new Person("guy 2", 1999, 3, 2);
		p.setMother(m);
		assertEquals(p.mother(), m);
		
	}
	
	// Testing get and set father
	@Test
	void fatherTest() {
		Person p = new Person("guy 1", 1990, 2, 7);
		Person f = new Person("guy 2", 1999, 3, 2);
		p.setFather(f);
		assertEquals(p.father(), f);
		
	}
	
	@Test
	void getYearTest() {
		Person p = new Person("guy 1", 1990, 2, 7);
		int y = p.birthYear();
		assertEquals(y, 1990);
	}
	
	@Test
	void getMonthTest() {
		Person p = new Person("guy 1", 1990, 2, 7);
		int m = p.birthMonth();
		assertEquals(m, 2);
		// Testing invalid months, one too small, one too big
		for (int i = 0; i <= 14; i += 14) {
			try {
				Person p2 = new Person("guy 1", 1990, i, 7);
		        fail("Expected an error");
		    } catch (AssertionError anError) {
		    	System.out.println("Error: month invalid");
		    }
		}
	}
	
	@Test
	void getDayTest() {
		Person p = new Person("guy 1", 1990, 2, 7);
		int d = p.birthDay();
		assertEquals(d, 7);
		// Testing invalid days, one too small, one too big
		for (int j = 0; j <= 32; j += 32) {
			try {
				Person p2 = new Person("guy 1", 1990, 1, j);
		        fail("Expected an error");
		    } catch (AssertionError anError) {
		    	System.out.println("Error: day invalid");
		    }
		}
	}
	
	@Test
	void numChildrenTest() {
		
		Person p = new Person("guy 1", 1990, 2, 7);
		int c = p.numChildren();
		assertEquals(c,0);
		Person m = new Person("m", 1, 1, 1);
		p.setMother(m);
		c = p.numChildren();
		int mc = m.numChildren();
		assertEquals(c,0);
		assertEquals(mc,1);
	}
	
	// Group B testing:
	@Test
	void setNameTest() {
		Person p = new Person("guy 1", 1990, 1, 1);
		p.setName("guy 2");
		// Setting to invalid names
		// Invalid name (empty string)
		try {
			p.setName("");
	        fail("Expected an error");
	    } catch (AssertionError anError) {
	    	System.out.println("Error: setName string empty");
	    }
		// Invalid name (null)
		try {
			p.setName(null);
	        fail("Expected an error");
	    } catch (AssertionError anError) {
	    	System.out.println("Error: setName string null");
	    }
	}

	@Test
	void setBirthYearTest() {
		Person p = new Person("guy 1", 1990, 1, 1);
		p.setBirthYear(2);
		int y = p.birthYear();
		assertEquals(2, y);
		
	}
	
	@Test
	void setBirthMonthTest() {
		Person p = new Person("guy 1", 1990, 1, 1);
		p.setBirthMonth(2);
		int m = p.birthMonth();
		assertEquals(2, m);
		// Testing invalid months, one too small, one too big
		for (int k = 0; k <= 14; k += 14) {
			try {
				p.setBirthMonth(k);
		        fail("Expected an error");
		    } catch (AssertionError anError) {
		    	System.out.println("Error: setBirthMonth month invalid");
		    }
		}
		
	}
	
	@Test
	void setBirthDayTest() {
		Person p = new Person("guy 1", 1990, 1, 1);
		p.setBirthDay(2);
		int d = p.birthDay();
		assertEquals(2, d);
		// Testing invalid months, one too small, one too big
		for (int l = 0; l <= 32; l += 32) {
			try {
				p.setBirthDay(l);
		        fail("Expected an error");
		    } catch (AssertionError anError) {
		    	System.out.println("Error: setBirthDay day invalid");
		    }
		}
	}
	
	@Test
	void setMotherTest() {
		
		Person p = new Person("guy 1", 1990, 2, 7);
		Person m1 = new Person("m1", 1, 1, 1);
		Person m2 = new Person("m2", 2, 2, 2);
		p.setMother(m1);
		p.setMother(m2);
		int mc1 = m1.numChildren();
		int mc2 = m2.numChildren();
		assertEquals(mc1, 0);
		assertEquals(mc2, 1);
	}
	
	@Test
	void setFatherTest() {
		
		Person p = new Person("guy 1", 1990, 2, 7);
		Person f1 = new Person("f1", 1, 1, 1);
		Person f2 = new Person("f2", 2, 2, 2);
		p.setFather(f1);
		p.setFather(f2);
		int fc1 = f1.numChildren();
		int fc2 = f2.numChildren();
		assertEquals(fc1, 0);
		assertEquals(fc2, 1);
	}
	
	// Group C
	@Test
	void isHalfSiblingTest() {
		Person p = new Person("guy 1", 1990, 2, 7);
		Person s1 = new Person("s1", 1, 1, 1);
		Person f = new Person("f", 2, 2, 2);
		Person m = new Person("m", 3, 3, 3);
		s1.setFather(f);
		p.setMother(m);
		assertEquals(p.isHalfSibling(s1),false);
		p.setFather(f);
		assertEquals(p.isHalfSibling(s1),true);
	}
	
	@Test
	void isOlderThanTest() {
		Person p = new Person("guy 1", 1990, 2, 7);
		Person s1 = new Person("s1", 1, 1, 1);
		assertEquals(p.isOlderThan(s1),false);
		assertEquals(s1.isOlderThan(p),true);
		try {
			p.isOlderThan(null);
	        fail("Expected an error");
	    } catch (AssertionError anError) {
	    	System.out.println("Error: isOlderThan other invalid");
	    }
		
	}
	
	
}
