
public class Student {
	String name;
	int age;
	int year;
	double gpa;
	
	public Student(){
		name = "";
		age = 0;
		year = 1;
		gpa = 4.0;	
	}
	
	public Student(String name, int year, int age, double gpa){
		this.name = name;
		this.year = year;
		this.age = age;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString(){
		return "Name: " + getName() + ", Age: " + getAge()
		+ ", Year: " + getYear() + ", gpa: " + getGpa();
	}
}
