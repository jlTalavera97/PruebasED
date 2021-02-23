package ed.examen.modelo;

public class Persona {
		
		private String dni;
		private String nombre;
		private String apellido1;
		
		public Persona() {}
		

		
		
		/**
		 * Constructor for persona.
		 * @param dni : NID number.
		 * @param nombre : Name.
		 * @param apellido1 : Surname.
		 */
		public Persona(String dni, String nombre, String apellido1) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellido1 = apellido1;
		}
		
		
		/**
		 * @return Returns the NID number.
		 */
		public String getDni() {
			return dni;
		}
		
		/**
		 * @param dni : Sets a NID number.
		 * @throws Exception : Checks that the NID number is correct, if not it throws an Exception.
		 */
		public void setDni(String dni) throws Exception {
			//comprobacion de si el ultimo caracter es una letra
			if(Character.isLetter(dni.charAt(dni.length()-1))) {
				this.dni=dni;
			}else {
				throw new Exception("El ultimo caracter introducido no es una letra");
			}
		}
		
		
		/**
		 * @return Returns the name.
		 */
		public String getNombre() {
			return nombre;
		}
		
		
		/**
		 * @param nombre : Sets a new name.
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		/**
		 * @return Returns the Surname.
		 */
		public String getApellido1() {
			return apellido1;
		}
		
		
		
		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dni == null) ? 0 : dni.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Persona other = (Persona) obj;
			if (dni == null) {
				if (other.dni != null)
					return false;
			} else if (!dni.equals(other.dni))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
		}
		

	}


