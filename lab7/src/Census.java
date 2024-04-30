import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Census {
	 
	 private List<Person> people = new ArrayList<Person>();
	 
	 
	 void addPerson(Person person) {
		 
		 people.add(person);
	 }
	 
	 boolean removePerson(Person person) {
		 
		 return people.remove(person);
	 }
	 int countPeople() {
		 
		 return people.size();
	 }
	 int countMales() {
		 
		 int count = 0;
		 
		 for (Person person : people) {
			 
			 if (person.getIsMale())
				 count++;
		 }
		 return count;
	 }
	 int countFemales() {
		 
		 return countPeople() - countMales();
			  
	 }
	 
	 void sortOnAge();
	 
	 void sortOnHeight();
	 
	 void sortOnGender();
	 
	
 }