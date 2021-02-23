package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Persona;

class PersonaTest {
	Persona p = new Persona("73452419X", "Jose Luis", "Talavera");

	@Test
	void testPersonaStringStringString() {
		Persona p2 = new Persona("12345678Y", "Pepe", "Martinez");

		assertEquals("12345678Y", p2.getDni());
		assertEquals("Pepe", p2.getNombre());
		assertEquals("Martinez", p2.getApellido1());
	}

	@Test
	void testGetDni() {
		assertEquals("73452419X", p.getDni());
	}

	@Test
	void testSetDni() {

		// Valid catch
		try {
			p.setDni("12345678P");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("12345678P", p.getDni());

		// Invalid class
		boolean launchedException = false;
		try {
			p.setDni("12345678");
		} catch (Exception e) {
			launchedException = true;
		}
		assertTrue(launchedException);

	}

	@Test
	void testGetNombre() {
		assertEquals("Jose Luis", p.getNombre());
	}

	@Test
	void testSetNombre() {
		p.setNombre("Carlos");
		assertEquals("Carlos", p.getNombre());
	}

	@Test
	void testGetApellido1() {
		assertEquals("Talavera", p.getApellido1());
	}

	@Test
	void testSetApellido1() {
		p.setApellido1("Saenz");
		assertEquals("Saenz", p.getApellido1());
	}

}
