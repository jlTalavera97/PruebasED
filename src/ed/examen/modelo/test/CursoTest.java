package ed.examen.modelo.test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jlTalavera97
 * @version 1.0
 */

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Curso;
import ed.examen.modelo.Persona;

class CursoTest {
	Curso c1 = new Curso();
	Curso c2 = new Curso();
	Persona p2 = new Persona("12345678T","Carlos","Saenz");
	

	@Test
	void testEliminarAlumno() {
		//Valid class
				boolean exceptionLaunched = false;
				try {
					c1.eliminarAlumno("73452419X");
				} catch (Exception e) {
					exceptionLaunched = true;
				}
				assertFalse(exceptionLaunched);
				
				//Invalid class
				exceptionLaunched = false;
				try {
					c1.eliminarAlumno("73452419");
				} catch (Exception e) {
					exceptionLaunched = true;
				}
				assertTrue(exceptionLaunched);
				
	}

	@Test
	void testAniadirAlumno() {
		Persona p = new Persona("73452419X","Jose Luis","Talavera");
		int sizeBefore = c1.numeroAlumnos();
		c1.aniadirAlumno(p);
		int sizeAfter = c1.numeroAlumnos();
		
		assertNotEquals(sizeBefore, sizeAfter);
	}

	@Test
	void testEstaRegistrado() {
		assertFalse(c1.estaRegistrado(p2.getDni()));
	}

	@Test
	void testNumeroAlumnos() {
		assertEquals(c1.numeroAlumnos(), c1.getListaAlumnos().size());
	}

}
