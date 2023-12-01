package com.EToDb.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int srNo;
	
	private String id;
	private String name;
	private String jobTitle;
	private String Departent;
	private String BusinessUnit;
	private String Gender;
	private String Ethnicity;
	private int age;
	private String HireDate;
	private String AnnuaslSalary;
	private String bonus;
	private String Country;
	private String city;
	private String exitdate;
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(String id, String name, String jobTitle, String departent, String businessUnit, String gender,
			String ethnicity, int age, String hireDate, String annuaslSalary, String bonus, String country,
			String city, String exitdate) {
		super();
		this.id = id;
		this.name = name;
		this.jobTitle = jobTitle;
		Departent = departent;
		BusinessUnit = businessUnit;
		Gender = gender;
		Ethnicity = ethnicity;
		this.age = age;
		HireDate = hireDate;
		AnnuaslSalary = annuaslSalary;
		this.bonus = bonus;
		Country = country;
		this.city = city;
		this.exitdate = exitdate;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", jobTitle=" + jobTitle + ", Departent=" + Departent
				+ ", BusinessUnit=" + BusinessUnit + ", Gender=" + Gender + ", Ethnicity=" + Ethnicity + ", age=" + age
				+ ", HireDate=" + HireDate + ", AnnuaslSalary=" + AnnuaslSalary + ", bonus=" + bonus + ", Country="
				+ Country + ", city=" + city + ", exitdate=" + exitdate + "]";
	}
	
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String string) {
		this.id = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getDepartent() {
		return Departent;
	}
	public void setDepartent(String departent) {
		Departent = departent;
	}
	public String getBusinessUnit() {
		return BusinessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		BusinessUnit = businessUnit;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEthnicity() {
		return Ethnicity;
	}
	public void setEthnicity(String ethnicity) {
		Ethnicity = ethnicity;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHireDate() {
		return HireDate;
	}
	public void setHireDate(String hireDate) {
		HireDate = hireDate;
	}
	public String getAnnuaslSalary() {
		return AnnuaslSalary;
	}
	public void setAnnuaslSalary(String annuaslSalary) {
		AnnuaslSalary = annuaslSalary;
	}
	public String getBonus() {
		return bonus;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getExitdate() {
		return exitdate;
	}
	public void setExitdate(String exitdate) {
		this.exitdate = exitdate;
	}
	
	
	
}
