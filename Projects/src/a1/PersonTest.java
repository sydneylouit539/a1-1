package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void test() {
		Person p = new Person("guy",1,2,3);
		fail("Not yet implemented");
		assertEquals(p.name(), "guy");
	}

}
