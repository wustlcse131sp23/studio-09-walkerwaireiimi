package studio9;

import assignment7.Student;

import java.util.HashMap;
import java.util.Map;

public class UniversityDatabase {
	private final Map<String, Student> database;

	public UniversityDatabase() {
		this.database = new HashMap <String, Student> ();
	}


	public void addStudent(String accountName, Student student) {
		// TODO
		database.put(accountName, student);
	}

	public int getStudentCount() {
		return database.size();
	}

	public String lookupFullName(String accountName) {
		Student person = database.get(accountName);
		if (person == null) {
			return null;
		}
		else {
			return person.getFullName();
		}
	}

	public double getTotalBearBucks() {
		double total = 0;
		for (String i : database.keySet()) {
			Student person = database.get(i);
			double bucks = person.getBearBucksBalance();
			total = total + bucks;
		}
		return total;
	}
}
