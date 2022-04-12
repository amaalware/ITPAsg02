package virtuPet;

public class Cat extends Pet{
	
	private int happiness;
	
	public Cat(int petID, string petName) {
		super(petID, petName);
		setHappiness(100);
	}
	
	public Cat(int petID, string perName, int age, int health, int hunger, int happiness) {
		super(petID, petName, age, health, hunger);
		setHappiness(happiness);
	}
	
	public void setHappiness(int happiness) {
		if (happiness < 0)
			this.happiness =0;
		else if (happiness > 100)
			this.happiness = 100;
		else
			this.happiness = happiness;
	}
	
	public int getHappiness() {
		return (happiness);
	}
	
	public boolean alive() {
		if (!super.alive() || getAge() > 100)
			return false;
		else
			return true;
	}
	
	public void feed() {
		setHappiness(getHappiness()+5);
		setHunger(getHunger()-5);
		setHealth(getHealth()+5);
	}
	
	public void play() {
		setHappiness(getHappiness()+20);
	}
	
}
