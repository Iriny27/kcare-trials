package kcare.Object;
import java.util.ArrayList;
public class Student implements StudentSubject {
	
	private ArrayList <Observer> observers; //list of observers (assistant)

	private String Student_Id;
    private String First_Name;
    private String Last_Name;
    private String PhysicalHistory;
    private String MentalHistory;
    private String Advice;
    private String Phone_number;  // shall we remove this att or the parent att?
    
    //ForeignKeys
    public School school;
    public Assistant assistant;
    public Group group;
    private Parent parent; // NEWLY added so that the parent can edit the medical history
	
    
    //Constructor with all fields
    public Student(String student_Id, String first_Name, String last_Name, String physicalHistory, String mentalHistory,
			String advice, String phone_number, School school, Assistant assistant, Group group, Parent parent) {
		super();
		Student_Id = student_Id;
		First_Name = first_Name;
		Last_Name = last_Name;
		PhysicalHistory = physicalHistory;
		MentalHistory = mentalHistory;
		Advice = advice;
		Phone_number = phone_number;
		this.school = school;
		this.assistant = assistant;
		this.group = group;
		this.parent = parent;
		observers = new ArrayList<>();
	}


	public String getStudent_Id() {
		return Student_Id;
	}


	public void setStudent_Id(String student_Id) {
		Student_Id = student_Id;
	}


	public String getFirst_Name() {
		return First_Name;
	}


	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}


	public String getLast_Name() {
		return Last_Name;
	}


	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}


	public String getPhysicalHistory() {
		return PhysicalHistory;
	}


	public void setPhysicalHistory(String physicalHistory) {
		PhysicalHistory = physicalHistory;
		notifyObservers();
	}


	public String getMentalHistory() {
		return MentalHistory;
	}


	public void setMentalHistory(String mentalHistory) {
		MentalHistory = mentalHistory;
		notifyObservers();
	}


	public String getAdvice() {
		return Advice;
	}


	public void setAdvice(String advice) {
		Advice = advice;
		notifyObservers();
	}


	public String getPhone_number() {
		return Phone_number;
	}


	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}


	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}


	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}


	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
            observer.update(this);
        }
		
	}
    

    
    
}