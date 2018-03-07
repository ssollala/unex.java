

public class Developer implements Comparable<Developer> {
	
	String name;
	double salary;
	int age;
	
	public Developer(String name, double salary, int age){
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int compareTo(Developer other){
		return (int) (this.getSalary() - other.getSalary());
	}
	 	
}

	
