import java.util.Arrays;
import java.util.Comparator;


public class TestSorting{

	public static void main(String[] args) {
		
		Developer[] developers = new Developer[4];
		Developer smith = new Developer("Smith", 50000, 25);
		Developer gary = new Developer("Gary", 100000, 30);
		Developer jane = new Developer("Jane", 200000, 59);
		Developer amy = new Developer("Amy", 60000, 45);
		
		developers[0] = smith;
		developers[1]= gary;
		developers[2] = jane;
		developers[3] = amy;
		
		Arrays.sort(developers);
		
		System.out.println("Storted developer objects by thier salary: ");
		for(Developer d: developers){
			   System.out.println(d.getName() +
				" [Salary: " + d.getSalary() + ", Age: "+ d.getAge() + "]");
			}
		
		// sort by name in dictionary order without using lambda
		Arrays.sort(developers, new Comparator<Developer>() {
			@Override
			public int compare(Developer d1, Developer d2) {
				String d1_name = d1.getName();
				String d2_name = d2.getName();
				return d1_name.compareTo(d2_name);
			}
		});

		System.out.println("\nStorted developer objects by thier name: ");
		
		for(Developer d: developers){
			   System.out.println(d.getName() +
				" [Salary: " + d.getSalary() + ", Age: "+ d.getAge() + "]");
		}
		
		

		
		
		
	}

}
