
package ed.examen.app;


import java.util.Scanner;

import ed.examen.modelo.Grade;
import ed.examen.modelo.Person;

public class Principal {
	/**
	 * @author jlTalavera97
	 * @version 1.0
	 */

	static Grade c;
	
	public static void main(String[] args) {
		c = new Grade();
		Integer opcion = mostrarMenuYRecogerOpcion();
		while(opcion!=0) {
			procesarOpcion(opcion);
			opcion = mostrarMenuYRecogerOpcion();
		}
	}

	private static Integer mostrarMenuYRecogerOpcion() {
		Scanner s = new Scanner(System.in);
		System.out.println("\n0 - Salir");
		System.out.println("1 - Aniadir persona");
		System.out.println("2 - Eliminar persona por DNI");
		System.out.println("3 - Numero de alumnos en el curso");
		System.out.println("4 - Mostrar todos los alumnos");
		System.out.print("Introducir opcion: ");
		Integer opcion = s.nextInt();
		return opcion;
	}
	
	public static void procesarOpcion(Integer opcion) {
		Scanner s = new Scanner(System.in);
		if(opcion==1) {//aniadir
			System.out.print("Interoducir dni: ");
			String inDNI= s.nextLine();
			System.out.print("Interoducir nombre: ");
			String inNombre= s.nextLine();
			System.out.print("Interoducir apellido1: ");
			String inApellido1= s.nextLine();
			
			c.addStudent(new Person(inDNI, inNombre, inApellido1));
			
		}else if (opcion==2) {//eliminar
			System.out.println("Introducir dni de usuario a eliminar: ");
			String inDNI = s.nextLine().trim();
			try {
				c.deleteStudent(inDNI);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(opcion==3) {//contar
			System.out.println(c.studentCount());
		}else if (opcion==4) {//todos
			c.printStudents();
		}
	}
}












