package fr.formation.springmvc.model;

import java.util.HashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Student {
	@NotNull(message = "required")
	@Size(min = 1 , message = "required")
	private String firstName;
	private String lastName;
	private String age;
	private String country;
	
	private HashMap<String, String> countryOptions;
	
	private String  language;
	private String[] professors;
	
	
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
	
	
	
	

}
