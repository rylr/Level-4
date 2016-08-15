package poly;

import java.util.ArrayList;

public class HumansAndVamps {
	
}

class Person {
	String name;
	int yearOfBirth;
	
	public Person(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return yearOfBirth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
}

class Vampire extends Person{
	public Vampire()
}

class Demographics {
	ArrayList<Person> people = new ArrayList<Person>();
	
	public Demographics(ArrayList<Person> people) {
		this.people = people;
	}
	
	public int getAverageAge() {
		int amount = people.size();
		int sum = 0;
		for(Person dude: people)
			sum += dude.getAge();
			
		return sum/amount;
	}
}
