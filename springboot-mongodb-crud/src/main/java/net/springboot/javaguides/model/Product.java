package net.springboot.javaguides.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "BookStore")
public class Product {
	
	@Id
	private long id;
	
	 @NotEmpty(message = "First name is required")
	 @Pattern(regexp="[a-zA-Z]+\\.?",
     message="name is invalid")
	    private String name;
	      
	      
	    @NotEmpty(message = "Email is required")
	    @Pattern(regexp="^(.+)@(.+)$",
        message="email is invalid")
	    @Email
	    private String email;
	     
	    @NotEmpty(message = "Phone number is required")
	    @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",
	             message="Mobile number is invalid")
	    private String mobilePhone;
	    @NotEmpty(message = "Pan is required")
	    @Pattern(regexp="[A-Z]{5}[0-9]{4}[A-Z]{1}",
	             message="pan is invalid")
	    private String pan;
	
	
	public Product(int i, String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}
	public String getPan() {
			return pan;
		}
		public void setPan(String pan) {
			this.pan = pan;
		}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
}
