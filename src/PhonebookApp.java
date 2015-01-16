import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Class with main method which simulates phonebook app. User have options to use this phonebook
 * for printing it, editing phonebook.
 *
 */
public class PhonebookApp {
	
	
	public static void main(String[] args) {
		Phonebook phonebook = new Phonebook();
		//Precreated contacts
		phonebook.addNewPerson("Vedad Zornic", 62951915);
		phonebook.addNewPerson("Haris Krkalic", 625567895);
		phonebook.addNewPerson("Emir Imamovic", 69878556);
		phonebook.addNewPerson("Gorjan Kalauzovic", 63587954);
		phonebook.addNewPerson("Emina Muratovic", 667825479);
		phonebook.addNewPhone("Vedad Zornic", 156874);
	
		System.out.println("Enter 1 for creating new person in phonebook. \n"
				+"Enter 2 for printing whole phonebook.\n"
				+"Enter 3 for managing user.\n"
				+"Enter 4 to exit program\n");		
		
		int choice = 0;
		/*
		 * In this while loop we create our phonebook app.
		 */
		while(choice != 4){		
			System.out.println("Enter your choice: ");
			choice = TextIO.getlnInt();
		
			switch (choice){			
			case 1: System.out.println("Enter full name of new person");
					String name = TextIO.getln();
					System.out.println("Enter phone number of person");
					int phone = TextIO.getlnInt();
					phonebook.addNewPerson(name, phone);
					break;
			case 2: phonebook.printPhonebook();
					break;
			case 4: return;			
			}
			
			if(choice == 3){				
				System.out.println("Press 1 for adding new number to person\n"
									+ "Press 2 for removing number from selected person\n"
									+ "Press 3 for removing whole person\n"
									+ "Press 4 for printing selected person\n"
									+ "Press 5 for back on main menu");
				int choice2 = TextIO.getlnInt();
				
				switch(choice2){
				case 1: System.out.println("Enter name of person");
						String name = TextIO.getln();
						System.out.println("Enter new number");
						int number = TextIO.getlnInt();
						phonebook.addNewPhone(name, number);
						break;
				case 2: System.out.println("Enter name of person");
						String removeName = TextIO.getln();
						System.out.println("Enter new number");
						int removeNumber = TextIO.getlnInt();
						phonebook.removePhoneNumber(removeName, removeNumber);
						break;
				case 3:	System.out.println("Enter name of person");
						String removePerson = TextIO.getln();
						phonebook.removePerson(removePerson);
						break;
				case 4: System.out.println("Enter name of person");
						String printName = TextIO.getln();
						phonebook.printPerson(printName);
						break;
				case 5: break;
				}				
			}			
		}	
	}	
}
