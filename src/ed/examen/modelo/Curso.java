package ed.examen.modelo;



import java.util.ArrayList;
import java.util.List;

public class Curso {

	private List<Persona> listaAlumnos;


	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}


	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}


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

	
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}


	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
