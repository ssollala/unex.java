
public class StudentInfo {
	private String studentID;
	private String lastName;
	private String firstName;
	private String phoneNumber;
	private String emailAddress;

	// Constructors
	public StudentInfo(){
		// Handle missing information
		this.studentID = "";
		this.lastName = "";
		this.firstName = "";
		this.phoneNumber = "";
		this.emailAddress = "";
	}
	
	public StudentInfo(String studentID, String lastName, String firstName, 
			String phoneNumber, String emailAddress) {
		this.studentID = studentID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	public StudentInfo(String[] args){
		String[] student = new String[args.length];
		for(int i=0; i<args.length; i++){
			student[i] = args[i];
		}
		this.studentID = student[0];
		this.lastName = student[1];
		this.firstName = student[2];
		this.phoneNumber = student[3];
		this.emailAddress = student[4];
	}

	// Print student data
	@Override
	public String toString() {
		return "[StudentID = " + studentID + ", "
				+ "Last Name = " + lastName + ", First Name = " + firstName
				+ ", Phone Number = " + phoneNumber + 
				", Email Address = " + emailAddress + "]";
	}

	// Getters and Setters
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
}
