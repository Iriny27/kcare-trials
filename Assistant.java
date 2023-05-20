package kcare.Object;

public class Assistant implements Observer {

	private String AssistantID;
	private String First_name;
	private String Last_name;
	private int Age;
	//ForeignKeys
	public Group group;
	public School school;
	

	//Constructor with all fields
	public Assistant(String assistantID, String first_name, String last_name, int age, Group group, School school) {
		super();
		AssistantID = assistantID;
		First_name = first_name;
		Last_name = last_name;
		Age = age;
		this.group = group;
		this.school = school;
	}

	
	
	
	public String getAssistantID() {
		return AssistantID;
	}

	public void setAssistantID(String assistantID) {
		AssistantID = assistantID;
	}

	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String first_name) {
		First_name = first_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}



     // student update notification for medical history
	@Override
	public void update(Student student) {
		System.out.println(First_name + Last_name + " received update for " + student.getFirst_Name()+ student.getLast_Name() + ": Physical history = " + student.getPhysicalHistory() + "\n and MEntal history " + student.getMentalHistory()+  "\nadvice = " + student.getAdvice());
		
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
