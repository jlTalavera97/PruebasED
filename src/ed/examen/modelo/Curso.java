package ed.examen.modelo;



import java.util.ArrayList;
import java.util.List;

public class Curso {

	private List<Persona> listaAlumnos;



	/**
	 * Method that removes a student.
	 * @param dni : student´s DIN
	 * @throws Exception : The method checks if the DIN is correct, if not it throws
	 *                   an exception.
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/**
	 * Method that add a student.
	 * @param p : Reference to Persona(String DNI, String nombre, String apellido1).
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/**
	 * Method that return a student if it´s registered.
	 * @param dni : NID number.
	 * @return returns the student if it founds it.
	 */
	public Boolean estaRegistrado(String dni) {
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/**
	 * Constructor for curso.
	 */
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/**
	 * @return Returns the number of students.
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	/**
	 * Method that prints all the students.
	 */
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
	/**
	 * Method that returns the list of students
	 * @return Returns the complete list of students
	 */
	public List<Persona> getListaAlumnos() {
		return listaAlumnos;
	}
}
