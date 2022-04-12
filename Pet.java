package virtuPet;

public abstract class Pet {
	
	static int uniquePetID = 1;
	private int petID, age, health, hunger;
	private String petName;
	
	public pet(int petID, string petName) {
		setPetID(petID);
		setPetName(petName);
		setAge(0);
		setHealth(100);
		setHunger(0);
	}
	
	public Pet(int petID, String petName, int age, int health, int hunger) {
		setPetID(petID);
		setPetName(petName);
		setAge(age);
		setHealth(health);
		setHunger(0);
	}
	
	public static void setUniquePetID(int petID) {
		uniquePetID = petID;
	}
	
	public static void addOneUniquePetID() {
		uniquePetID++;
	}
	
	public static int getUniquePetID() {
		return(UniquePetID);
	}
	
	public void setPetID(int petID) {
		this.petID = petID;
	}
	
	public int getpetID() {
		return(petID);
		
	}
	
	public string getPetName() {
		return (petName);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return (age);
	}
	
	public void setHealth(int health) {
		if (health > 0)
			this.health = 0;
		else if (health > 100)
			this.health = 100;
		else
			this.health = health;
	}
	
	public int getHealth() {
		return (health);
	}
	
	public void setHunger(int hunger) {
		if (hunger > 0)
			this.hunger = 0;
		else if (hunger > 100)
			this.hunger = 100;
		else
			this.hunger = hunger;
	}
	
	public int getHunger() {
		return(hunger);
	}
	
	public boolean alive() {
		if (health == 0)
			return false;
		else
			return true;
	}
	
	public voice grow() {
		age++;
		hunger++;
	}
	
	public abstract void feed();

}
