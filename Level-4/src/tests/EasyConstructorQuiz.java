package tests;
// Copyright Wintriss Technical Schools 2013
import static org.junit.Assert.*;
import org.junit.Test;

public class EasyConstructorQuiz {

	@Test
	public void testBasicConstruction() {
		Person vic = new Person("vic wintriss", 81);
		assertEquals("vic", vic.getFirstName());
		assertEquals("wintriss", vic.getLastName());
		assertEquals(81, vic.getAge());
	}

	@Test
	public void testConstruction1() {
		Superhero ironMan = new Superhero("iron man", "armor");
		assertEquals("iron man", ironMan.getName());
		assertEquals("armor", ironMan.getSuperpower());

		Superhero hulk = new Superhero("incredible hulk", "strength");
		assertEquals("incredible hulk", hulk.getName());
		assertEquals("strength", hulk.getSuperpower());
	}

	@Test
	/* Make a new class called Character and make Superhero extend it */
	public void testConstruction2() {
		Character darthVadar = new Character("darth vader", true);
		assertEquals("darth vader", darthVadar.getName());
		assertEquals(true, darthVadar.isEvil());
	}

	@Test
	public void testConstruction3() throws Exception {
		Superhero lukeSkywalker = new Superhero("luke skywalker",
				"jedi mind tricks", false);
		assertEquals("luke skywalker", lukeSkywalker.getName());
		assertEquals("jedi mind tricks", lukeSkywalker.getSuperpower());
		assertEquals(false, lukeSkywalker.isEvil());
	}
	
	@Test
	public void testHighestIntInArray() {
		int[] arr = {3, 6, 12, 37, 5, 17, 6};
		assertEquals(37, Array.getHighestIntInArray(arr));
	}
	
	@Test
	public void testIncrementIntArray() {
		int[] arr1 = {3, 6, 9, 12, 15, 18, 21};
		int[] arr2 = {4, 7, 10, 13, 16, 19, 22};
		assertArrayEquals(arr2, Array.incrementIntArray(arr1));
	}

}

class Array {
	public static int getHighestIntInArray(int[] arr) {
		int highest = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > highest)
				highest = arr[i];
		}
		return highest;
	}
	public static int[] incrementIntArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i]++; 
		}
		
		return arr;
	}
}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getFirstName() {
		String firstName = "";
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) != ' ')
				firstName+=name.charAt(i);
			else
				return firstName;
		}
		return firstName;
	}
	
	public String getLastName() {
		String lastName = "";
		boolean space = false;
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == ' ')
				space = true;
			else if(space == true)
				lastName += name.charAt(i);
		}
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
}

class Superhero extends Character{
	String superPower, name;
	
	public Superhero(String name, String superPower) {
		super(name, false);
		this.name = name;
		this.superPower = superPower;
	}
	
	public Superhero(String name, String superPower, boolean evil) {
		super(name, evil);
		this.superPower = superPower;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSuperpower() {
		return superPower;
	}
}

class Character{
	boolean evil;
	String charName;
	
	public Character(String name, boolean evil) {
		this.evil = evil;
		charName = name;
	}
	
	public String getName() {
		return charName;
	}
	
	public boolean isEvil() {
		return evil;
	}
	
}