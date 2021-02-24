package ed.examen.modelo;
/**
 * @author jlTalavera97
 * @version 1.0
 */
public class Person {
		
		private String idCard;
		private String name;
		private String surname;
		
		public Person() {}
		

		
		
		/**
		 * Constructor for person.
		 * @param idCard : ID Card number.
		 * @param name : Name.
		 * @param surname : Surname.
		 */
		public Person(String idCard, String name, String surname) {
			this.idCard = idCard;
			this.name = name;
			this.surname = surname;
		}
		
		
		/**
		 * @return Returns the ID Card number.
		 */
		public String getIdCard() {
			return idCard;
		}
		
		/**
		 * @param idCard : Sets a ID Card number.
		 * @throws Exception : Checks that the ID Card number is correct, if not it throws an Exception.
		 */
		public void setIdCard(String idCard) throws Exception {
			//checks if the last char is a letter.
			if(Character.isLetter(idCard.charAt(idCard.length()-1))) { 
				this.idCard=idCard;
			}else {
				throw new Exception("Last character is not a letter");
			}
		}
		
		
		/**
		 * @return Returns the name.
		 */
		public String getName() {
			return name;
		}
		
		
		/**
		 * @param name : Sets a new name.
		 */
		public void setName(String name) {
			this.name = name;
		}
		
		/**
		 * @return Returns the Surname.
		 */
		public String getSurname() {
			return surname;
		}
		
		
		
		/**
		 * @param surname : Sets a new surname.
		 */
		public void setSurname(String surname) {
			this.surname = surname;
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((idCard == null) ? 0 : idCard.hashCode());
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
			Person other = (Person) obj;
			if (idCard == null) {
				if (other.idCard != null)
					return false;
			} else if (!idCard.equals(other.idCard))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Person [ID Card=" + idCard + ", name=" + name + "]";
		}
		

	}


