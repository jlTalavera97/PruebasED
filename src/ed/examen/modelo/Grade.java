package ed.examen.modelo;



import java.util.ArrayList;
import java.util.List;

/**
 * @author jlTalavera97
 * @version 1.0
 */
public class Grade {

	private List<Person> studentList;



	/**
	 * Method that removes a student.
	 * @param idCard : student´s ID Card
	 * @throws Exception : The method checks if the ID Card is correct, if not it throws
	 *                   an exception.
	 */
	public void deleteStudent(String idCard) throws Exception {
		if (idCard.length() == 9) {// checks DIN.
			studentList.remove(new Person(idCard, "", "")); // only idCard needed for constructor.
		} else {
			throw new Exception("The ID Card has wrong length");
		}
	}

	/**
	 * Method that add a student.
	 * @param p : Reference to Person(String idCard, String name, String surname).
	 */
	public void addStudent(Person p) {
		studentList.add(p);
	}

	/**
	 * Method that return a student if it´s registered.
	 * @param idCard : ID Card number.
	 * @return returns the student if it founds it.
	 */
	public Boolean isRegistered(String idCard) {
		int i = 0;
		Boolean founded = false;
		while (!founded && i < studentList.size()) {
			if (studentList.get(i).getIdCard().equals(idCard)) {
				founded = true;
			}
			i++;
		}
		return founded;
	}

	/**
	 * Constructor for grade.
	 */
	public Grade() {
		studentList = new ArrayList<Person>();
	}

	/**
	 * @return Returns the number of students.
	 */
	public Integer studentCount() {
		return studentList.size();
	}

	/**
	 * Method that prints all the students.
	 */
	public void printStudents() {
		for (Person persona : studentList) {
			System.out.println(persona);
		}
	}
	/**
	 * Method that returns the list of students
	 * @return Returns the complete list of students
	 */
	public List<Person> getListaAlumnos() {
		return studentList;
	}
}
