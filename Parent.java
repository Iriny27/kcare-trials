
package kcare.Object;

public class Parent {
	private String ParentName;
	private String Phone_number;
	
	//foreign keys
	private Student student;
	
	
// constructor
     public Parent(String parentName, String phone_number, Student student) {
		ParentName = parentName;
		Phone_number = phone_number;
		this.student = student;
	}
     
     // method that lets parent edit the student physical history
		void editPhysicalHistory(String physicalHistory) {
			student.setPhysicalHistory(physicalHistory);
		}
		
	     // method that lets parent edit the student mental history
		void editMentalHistory(String mentalHistory) {
			student.setMentalHistory(mentalHistory);
		}
		
		
		
	     // method that lets parent edit the student advice
		 void editAdvice(String advice) {
			 student.setAdvice(advice);
		 }
		 
		 public void viewStudent (Student student) {
				System.out.println ("First Name: " + student.getFirst_Name()+"\n" +
						            "Last Name: " + student.getLast_Name()+"\n" +
						            "Student ID: " + student.getStudent_Id()+"\n" +
						            "Physical History: " + student.getPhysicalHistory()+"\n"+
						            "Mental History: " + student.getMentalHistory()+"\n"+
						            "Advice: " + student.getAdvice()+"\n");
						            }
}
