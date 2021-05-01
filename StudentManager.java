package tutorialPractice;

public class StudentManager {
	int studentNumber;
	String firstName;
	String lastName;
	String currentClass;
	
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCurrentClass() {
		return currentClass;
	}
	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}
	
	
	
	public void register() {
		System.out.println(firstName+" "+lastName +" has registered");
	}
	public void remove() {
		System.out.println(firstName+" "+lastName +" has removed");
	
	}
	public void passClass() {
		System.out.println(firstName+" "+lastName +" pass the class succesfully");
	}
	
	public void failClass() {
		System.out.println(firstName+" "+lastName +" fail the class :(");
	}

}
