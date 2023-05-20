package kcare.Object;
import java.util.ArrayList;
import java.util.List;

public class Group {
	
	private String Group_Id;
	private int Number_of_Students;
	
	
	//ForeignKeys
	public Assistant assistant;
	public ArrayList <Student> studentList;
	public School school;
	
	
	
	//Constructor
	public Group(String group_Id, int number_of_Students, Assistant assistant, ArrayList <Student> studentList, School school) {
		super();
		Group_Id = group_Id;
		Number_of_Students = number_of_Students;
		this.assistant = assistant;
		this.studentList = studentList;
		this.school = school;
	}
	
	 public void addAssistantAsObserver(Student student) {
	        student.registerObserver(assistant);
	    }

	    public void removeAssistantAsObserver(Student student) {
	        student.removeObserver(assistant);
	    }

	    public void setAssistant(Assistant assistant) {
	        this.assistant = assistant;
	    }


	public String getGroup_Id() {
		return Group_Id;
	}



	public void setGroup_Id(String group_Id) {
		Group_Id = group_Id;
	}



	public int getNumber_of_Students() {
		return Number_of_Students;
	}



	public void setNumber_of_Students(int number_of_Students) {
		Number_of_Students = number_of_Students;
	}



	public Assistant getAssistant() {
		return assistant;
	}



	
	
	
	
}
