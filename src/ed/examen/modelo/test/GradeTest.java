package ed.examen.modelo.test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jlTalavera97
 * @version 1.0
 */

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Grade;
import ed.examen.modelo.Person;

class GradeTest {
	Grade c1 = new Grade();
	Grade c2 = new Grade();
	Person p2 = new Person("12345678T","Carlos","Saenz");
	

	@Test
	void testDeleteStudent() {
		//Valid class
				boolean exceptionLaunched = false;
				try {
					c1.deleteStudent("73452419X");
				} catch (Exception e) {
					exceptionLaunched = true;
				}
				assertFalse(exceptionLaunched);
				
				//Invalid class
				exceptionLaunched = false;
				try {
					c1.deleteStudent("73452419");
				} catch (Exception e) {
					exceptionLaunched = true;
				}
				assertTrue(exceptionLaunched);
				
	}

	@Test
	void testAddStudent() {
		Person p = new Person("78945612T","Jose Luis","Talavera");
		int sizeBefore = c1.studentCount();
		c1.addStudent(p);
		int sizeAfter = c1.studentCount();
		
		assertNotEquals(sizeBefore, sizeAfter);
	}

	@Test
	void testIsRegistered() {
		assertFalse(c1.isRegistered(p2.getIdCard()));
	}

	@Test
	void testStudentCount() {
		assertEquals(c1.studentCount(), c1.getListaAlumnos().size());
	}

}
