package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void gettersTest() {
		Person p = new Person("guy 1", 1990, 2, 7);
		String n = p.name();
		assertEquals(n, "guy 1");
		int y = p.birthYear();
		assertEquals(y, 1990);
		int m = p.birthMonth();
		assertEquals(m, 2);
		int d = p.birthDay();
		assertEquals(d, 7);
	}

}
