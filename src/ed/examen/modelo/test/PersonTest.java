package ed.examen.modelo.test;
/**
 * @author jlTalavera97
 * @version 1.0
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Person;

class PersonTest {
	Person p = new Person("73452419X", "Jose Luis", "Talavera");

	@Test
	void testPerson() {
		Person p2 = new Person("12345678Y", "Pepe", "Martinez");

		assertEquals("12345678Y", p2.getIdCard());
		assertEquals("Pepe", p2.getName());
		assertEquals("Martinez", p2.getSurname());
	}

	@Test
	void testGetIdCard() {
		assertEquals("73452419X", p.getIdCard());
	}

	@Test
	void testSetIdCard() {

		// Valid catch
		try {
			p.setIdCard("12345678P");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("12345678P", p.getIdCard());

		// Invalid class
		boolean launchedException = false;
		try {
			p.setIdCard("12345678");
		} catch (Exception e) {
			launchedException = true;
		}
		assertTrue(launchedException);

	}

	@Test
	void testGetName() {
		assertEquals("Jose Luis", p.getName());
	}

	@Test
	void testSetName() {
		p.setName("Carlos");
		assertEquals("Carlos", p.getName());
	}

	@Test
	void testGetSurname() {
		assertEquals("Talavera", p.getSurname());
	}

	@Test
	void testSetSurname() {
		p.setSurname("Saenz");
		assertEquals("Saenz", p.getSurname());
	}

}
