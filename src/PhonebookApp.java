import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class PhonebookApp {
	private static HashMap<String, Person> phonebook; 
	private static Set<String> keys;
	
	
	public static void main(String[] args) {
		Phonebook phonebook = new Phonebook();
		keys = phonebook.keySet();
		
		Person vedad = new Person("Vedad Zornic", 61929253);
		Person haris = new Person("Haris Krkalic", 62556789);
		Person emir = new Person("Emir Imamovic", 69878556);
		Person gorjan = new Person("Gorjan Kalauzovic", 63587954);
		Person emina = new Person("Emina Muratovic", 667825479);		

		phonebook.put(vedad.getName(), vedad);
		phonebook.put(haris.getName(), haris);
		phonebook.put(emir.getName(), emir);
		phonebook.put(gorjan.getName(), gorjan);
		phonebook.put(emina.getName(), emina);
		gorjan.addNewPhoneNumber(4214141);
		gorjan.addNewPhoneNumber(4142141);			
		
		int input = 0;
		while(input != 4){
			System.out.println("Enter: \n1 for new person \n2 for printing phonebook \n3 for editing existing person \n4 for exiting program");
			input = TextIO.getlnInt();
			
			if(input == 1){
				System.out.println("Enter name of new person and phone number");
				String name = TextIO.getln();
				int phone = TextIO.getlnInt();				
				if(keys.contains(name))
					phonebook.get(name).addNewPhoneNumber(phone);
				else
				phonebook.put(name, new Person(name, phone));				
			}
			
			if(input == 2)
				printPhonebook();
			
			if(input == 3){
				System.out.println("For removing person press 5, for adding new number 6");
				int choice = TextIO.getlnInt();
				
				if(choice == 6){				
				System.out.println("Enter name of person you want to edit");
				String name = TextIO.getln();				
					if(keys.contains(name)){
						System.out.println("Enter additional number");
						int newNumber = TextIO.getlnInt();
						phonebook.get(name).addNewPhoneNumber(newNumber);					
					}else
						System.out.println("That person isn't in your phonebook");
				}else if(choice == 5){
					System.out.println("Enter name of person you want to remove a number");
					String name = TextIO.getln();	
					System.out.println("Enter number you want to remove");
					int number = TextIO.getlnInt();
					phonebook.get(name).removeNumber(number);
				}
			}			
		}
	}	
}
