package ed.examen.modelo;

public class Persona {
		
		private String dni;
		private String nombre;
		private String apellido1;
		
		public Persona() {}
		

		
		
	
		public Persona(String dni, String nombre, String apellido1) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellido1 = apellido1;
		}
		
		
		
		public String getDni() {
			return dni;
		}
		
		
	
		public void setDni(String dni) throws Exception {
			//comprobacion de si el ultimo caracter es una letra
			if(Character.isLetter(dni.charAt(dni.length()-1))) {
				this.dni=dni;
			}else {
				throw new Exception("El ultimo caracter introducido no es una letra");
			}
		}
		
		
		
		public String getNombre() {
			return nombre;
		}
		
		
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
	
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


