package virtuPet;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Owner {
	
	private String ownerID;
	private HashMap<K, V> <Integer, Pet> pets;
	private string ownerName;
	
	public Owner(String ownerID, String ownerName) {
		setOwnerID(ownerID);
		setOwnerName(ownerName);
		pets = new HashMap <Integer,Pet>();
	}
	
	public void setOwnerID(String OwnerID) {
		this.ownerID = ownerID;
	}
	
	public static int getOwnerID() {
		return(ownerID);
	}
	
	public void setPets(int petID, Pet thePet) {
		pets.put(petID, thePet);
	}
	
	public void setOwnerName(string ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getOwnerName() {
		return(ownerName);
	}
	
	public void growPets() {
		pet [] petArray = new Pet[pets.size()];
		petArray = getPets();
		
		for (int i =0; i < petArray.length; i++) {
			petArray[i].grow();
		}
	}
	
	public Pet []getPets(){
		Set s = sortedMap.keySet();
		Iterator<E> itr = s.iterator();
		while (its.hasNext()) {
			petArray[i++] = pets.get((Integer)itr.next());
		}
		return (petArray)
	}
	
	public Pet getPet(int PetID) {
		return (pets.get(petID));
	}

	
	public void saveOwner() {
		String inputLine;
		Pet [] petList = getPets();
		
		try {
			PrintWriter writer = new PrintWriter(new FileWriter(ownerID+ " .txt"));
			
			writer.println(ownerID + ";" + ownerName);
			writer.println(String.valueOf(Pet.getUniquePetID()));
			
			for (int i = 0; i < petList.length; i++) {
				if (petList[i]i.alive()) {
					if (petList[i] instanceof Cat) {
						writer.println("For cat");
						inputLine = "Cat:" + petList[i].getPetID + "," + petList[i].getPetName();
						writer.println(inputLine);
					}
				}
			}
		}
	}

}
