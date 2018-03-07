
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		Student s1 = new Student("Henrry", 2, 20, 3.5);
		Student s2 = new Student("Bob", 3, 25, 3.0);
		Student s3 = new Student("Andria", 1, 19, 4.0);
		Student s4 = new Student("Jasmone", 4, 26, 2.5);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		// lambda expressions to sort a list
		
		// sorted by age
		students.sort((Student o1, Student o2) -> o1.getAge() - o2.getAge());
		System.out.println("Sorted by age:");
		for(Student s: students){
			System.out.println(s.toString());
		}
		
		// sorted by gpa
		students.sort((Student o1, Student o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println("\nSorted by name:");
		for(Student s: students){
			System.out.println(s.toString());
		}
		
		// sorted by gpa
		students.sort((Student o1, Student o2) -> Double.compare(o1.getGpa(), o2.getGpa()));
		System.out.println("\nSorted by gpa:");
		students.forEach(student->System.out.println(student));
		
		
//		String[] friends = { "Bob", "Billy", "Mary", "Jasmine", "Audry" };
//		
//		System.out.println("Sorted in dictionary order:");
//		Arrays.sort(friends);	
//		System.out.println(Arrays.toString(friends));
//		
//		System.out.println("Sorted by length:");
//		// ascending order
//		Arrays.sort(friends, (String first, String second) -> (first.length() - second.length()));
//		System.out.println(Arrays.toString(friends));
//	
//		ActionListener listener = new TimePrinter();
//		Timer t = new Timer(10000, listener);
//		t.start();
////		
////		JOptionPane.showMessageDialog(null, "Quit program?");
////		
//		System.exit(0);
//		
		
	}

}
