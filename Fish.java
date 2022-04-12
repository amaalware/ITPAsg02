package virtuPet;

public class Fish extends Pet{
	private int temp;
	private boolean heater;
	
	public Fish(int petID, String petName) {
		super(petID, petName);
		setTemp(20);
		onHeater();
	}
	
	public Fish(int petID, string petName, int age, int health, int hunger, int temp, boolean heater) {
		super(petID, petName, age, health, hunger);
		setTemp(temp);
		setHeater(heater);
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	public int getTemp() {
		return (temp);
	}
	
	public void setHeater(boolean heater) {
		this.heater = heater;
	}
	
	public void onHeater() {
		setHeater(true);
	}
	
	public voice offHeater() {
		setHeater(false);
	}
	
	public boolean alive() {
		if(!super.alive() || getAge() > 60)
			return false;
			else
				return true;
	}
	
	public void feed() {
		setHunger(getHunger()-10);
		setHealth(getHealth()+1);
	}
}
