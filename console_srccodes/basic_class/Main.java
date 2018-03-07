import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	
		// collect data using command line
		System.out.println("Student Information collected from command line:");
		if(args.length > 0){		
			StudentInfo student1 = new StudentInfo(args);
			System.out.println(student1.toString());
		}
		else{
			System.out.println("No student information found");
		}
		
		// collect data using keyboard input
		System.out.println("\nCollecting student information from user");
		
		ArrayList<StudentInfo> multiStudent = new ArrayList<>();
//		StudentInfo student2 = new StudentInfo();
		Scanner sc = new Scanner(System.in);
	
		String studentId;
		String lName;
		String fName;
		String phone;
		String email;
		String answer;
	
		do {
			
			System.out.print("Enter student ID: ");
			studentId = sc.nextLine();
			
			System.out.print("Enter last name: ");
			lName = sc.nextLine();

			System.out.print("Enter first name: ");
			fName = sc.nextLine();

			System.out.print("Enter phone number: ");
			phone = sc.nextLine();
				
			System.out.print("Enter email address: " );
			email = sc.nextLine();
			
			multiStudent.add(new StudentInfo(studentId, lName, fName, phone, email));
				
			System.out.println("Do you want to add more student information? (Y or N)");
			answer = sc.nextLine().toUpperCase();
			
		} while (answer.equals("Y"));
		
		sc.close();
		
		System.out.println("\nList of Student Information collected from keyboard:");
		int numberOfStudent = 0;
		for(StudentInfo student: multiStudent){
			System.out.println("StudentInfo[" + numberOfStudent + "]" + ": " + student.toString());
			numberOfStudent++;
		}
	
				
	}
		
}
