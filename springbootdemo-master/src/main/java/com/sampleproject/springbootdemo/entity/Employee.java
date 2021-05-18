package com.sampleproject.springbootdemo.entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
//import lombok.Getter;
//import lombok.Setter;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



//@Getter
//@Setter
@Document (collection = "Member")
public class Employee {
	
	public String getEmployee_fname() {
		return Employee_fname;
	}

	public void setEmployee_fname(String employee_fname) {
		Employee_fname = employee_fname;
	}

	public String getEmployee_lname() {
		return Employee_lname;
	}

	public void setEmployee_lname(String employee_lname) {
		Employee_lname = employee_lname;
	}

	public String getEmployee_email() {
		return Employee_email;
	}

	public void setEmployee_email(String employee_email) {
		Employee_email = employee_email;
	}

	public String getEmployee_phoneno() {
		return Employee_phoneno;
	}

	public void setEmployee_phoneno(String employee_phoneno) {
		Employee_phoneno = employee_phoneno;
	}

	public String getEmployee_gender() {
		return Employee_gender;
	}

	public void setEmployee_gender(String employee_gender) {
		Employee_gender = employee_gender;
	}

	public int getEmployee_Id() {
		return Employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}


    @Id
	
	private int Employee_Id;
    private String Employee_fname;	
	
    private String Employee_lname;	
	
	private String Employee_email;
	
    private String Employee_phoneno;
	
	private String Employee_gender;
	
	public Employee(int employee_Id, String employee_lname, String employee_email, String employee_phoneno,
			String employee_gender, String employee_fname) {
		super();
		Employee_fname = employee_fname;
		Employee_lname = employee_lname;
		Employee_email = employee_email;
		Employee_phoneno = employee_phoneno;
		Employee_gender = employee_gender;
		Employee_Id = employee_Id;
	}

	public Employee()
	{
		
	}

}
