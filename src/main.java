
public class main {

	public static void main(String[] args) {
		PetHotel hotel1 = new PetHotel();
		
		hotel1.addPet(1, "Rex");
		hotel1.addPet(1, "Geani");
		hotel1.addPet(101, "Martinel");
		hotel1.addPet(5, "Linda");
		hotel1.addPet(12, "Coco");
		hotel1.addPet(17, "Hobo");
		System.out.println();
		
		System.out.println("In prezent sunt " + hotel1.getOccupiedRooms() + " camere ocupate");
		System.out.println();
		
		hotel1.afis();
		System.out.println();
		
		hotel1.getKeys();
		System.out.println();
		
		hotel1.getValues();
		System.out.println();
		
		hotel1.getValue(12);
		hotel1.getValue(15);
		System.out.println();
		
		hotel1.getValue(17);
		hotel1.changeOccupant(17, "Misu");
		hotel1.getValue(17);
		hotel1.getValue(64);
		hotel1.changeOccupant(64, "Makai");
		hotel1.getValue(64);
		System.out.println();
	}

}
