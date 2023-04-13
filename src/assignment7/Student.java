package assignment7;
	

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int id; 
	private int totalAttemptedCredits;
	private int totalPassingCredits;
	private double totalGradeQualityPoints;
	private double bearBucksBalance;
	
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	public int getId() {
		return id;
	}

	public void depositBearBucks(double amount) {
		this.bearBucksBalance = this.bearBucksBalance + amount;
	}

	public double getBearBucksBalance() {
		return bearBucksBalance;
	}
}
