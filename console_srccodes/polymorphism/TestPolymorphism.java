package com.dasol.polymorphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		Student notKnown1 = new Student();
		Student john = new Student("Smith", "John", 60, 175, 3.5);
		
		Employee notknown2 = new Employee();
		Employee bill = new Employee("Gates", "Bill", 72, 185, 1, 45000.00); 
		Employee anita = new Employee("Jimenez", "Anita", 61, 134, 2, 123000.00);
		Employee chuck = new Employee("Lee", "Chuck", 68, 172, 3, 76000.00);

		Person[] persons = new Person[Person.getNumberOfPerson()];
		persons[0] = notKnown1;
		persons[1]= john;
		persons[2] = notknown2;
		persons[3]= bill; 
		persons[4] = anita; 
		persons[5]= chuck;

		for (Person p : persons) { 
			System.out.println(p);
		}
		System.out.println("\n...Total number of persons: " + Person.getNumberOfPerson());
	}

}
