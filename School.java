package kcare.Object;

//import java.util.UUID;
/*import java.util.ArrayList;
import java.util.List;*/

public class School {
	private String School_Id;
	private String School_name;
	private String school_address;
	
	
	
	//Constructor
	public School(String iD, String name, String address) {
		super();
		this.School_Id = iD;
		this.School_name = name;
		this.school_address = address;
	}
	
	
	

	public String getSchool_Id() {
		return School_Id;
	}

	public void setSchool_Id(String school_Id) {
		School_Id = school_Id;
	}

	public String getSchool_name() {
		return School_name;
	}

	public void setSchool_name(String school_name) {
		School_name = school_name;
	}

	public String getSchool_address() {
		return school_address;
	}

	public void setSchool_address(String school_address) {
		this.school_address = school_address;
	}
	


}