package fr.formation.springmvc.model;

import java.util.HashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import fr.formation.springmvc.validation.VertyCode;



public class Student {
	@NotNull(message = "required")
	@Size(min = 1 , message = "required")
	private String firstName;
	private String lastName;
	
	@NotNull(message = "required")
	@Min(value= 20 , message ="must be grater than or equal 20")
	@Max(value= 50 , message ="must be less than or equal 50")
	private String age;
	
	@NotNull(message = "required")
	@VertyCode
	private String indexCountry;
	
	private String country;
	
	private HashMap<String, String> countryOptions;
	
	private String  language;
	private String[] professors;
	
	@NotNull(message = "required")
	@Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$" , message="Invalid Email")
	private String email;
	
	@NotNull(message = "required")
	private Integer code;
	
	
	public Student() {
		countryOptions = new HashMap<String, String>();
		countryOptions.put("Maroc", "MAR");
		countryOptions.put("France", "FRA");
		countryOptions.put("Tunisie", "TUN");
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(HashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getProfessors() {
		return professors;
	}
	
	public void setProfessors(String[] professors) {
		this.professors = professors;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getIndexCountry() {
		return indexCountry;
	}

	public void setIndexCountry(String indexCountry) {
		this.indexCountry = indexCountry;
	}
	
	

}
