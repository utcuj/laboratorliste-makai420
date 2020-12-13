import java.util.*;

public class PetHotel {
	private Map<Integer, String> cazare = new HashMap<>();
	private int nrCamere = 100;
	
	public void addPet(int camera, String numele) {
		if ( !(camera > 0 && camera <= nrCamere) ) {
			System.out.println("Camera introdusa nu exista in hotel!");
		}
		else {
			if ( cazare.containsKey(camera) )
				System.out.println("Exista deja un animalut cazat in camera " + camera);
			else
				cazare.put(camera, numele);
		}
	}
	
	public int getOccupiedRooms() {
		return cazare.size();
	}
	
	public void afis() {
		for (Map.Entry<Integer,String> iterator : cazare.entrySet()) {
			System.out.println("Camera: " + iterator.getKey() + " animalut: " + iterator.getValue());
		}
	}
	
	public void getKeys() {
		for (int key : cazare.keySet()) {
			System.out.println("Cheia: " + key);
		}
	}
	
	public void getValues() {
		for (String value : cazare.values()) {
			System.out.println("Valoarea: " + value);
		}
	}
	
	public void getValue(int key) {
		if ( !cazare.containsKey(key) )
			System.out.println("Nu exista nicio mapare cu cheia " + key);
		else
			System.out.println("Valoarea de la cheia " + key + " este " + cazare.get(key));
	}
	
	public void changeOccupant(int key, String value) {
		if ( !cazare.containsKey(key) )
			System.out.println("Camera " + key + " nu este ocupata");
		else
			cazare.put(key, value);
	}
	
	public int getNrCamere() {
		return nrCamere;
	}
	
}
