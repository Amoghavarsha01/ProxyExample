package com.mainClassPackage;

import java.util.Calendar;

import javax.swing.plaf.synth.SynthSpinnerUI;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;

public class MainClass implements MainInterface{
	int name;
	int salary;
	int age;
	public MainClass(int name, int salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getEmployeeRetirementYear(){
		System.out.println("Inside getEmployeeRetirementYear");
		int empAge = this.age;
		int remainingYears = 60-empAge;
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year + remainingYears; 
	}
	
}
