import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 * Class phonebook that creates our own phonebook. It has options to add/remove new person
 * or to edit existing persons info. For creating phonebook we used HashMap. To get through phonebook as keys
 * we used String ( name of persons ). Values in our hashmap are persons.
 * @author Vedad_2
 *
 */
public class Phonebook {	
	private   HashMap<String, Person> phonebook; 	
	private   Set<String> keys;
	
	
	/**
	 * Constructor that creates our phonebook. In constructor all we make is hashmap and set of keys which
	 * help us move through our phonebook.
	 */
	public Phonebook(){
		phonebook = new HashMap<String, Person>();
		keys = phonebook.keySet();
	}
	
	/**
	 * Method which prints our whole phonebook.
	 */
	public  void printPhonebook(){
		Iterator<String> keyIterator = keys.iterator();
		while( keyIterator.hasNext() ){
			String key = keyIterator.next();			
			Iterator<Integer> valueIterator = phonebook.get(key).getPhoneNumbers().iterator();
			System.out.println("Name: " + key);
			while(valueIterator.hasNext()){
				System.out.print( "\tPhone numbers: " +valueIterator.next() + "\n" );
			}
			System.out.println();
		}
	}
	
	/**
	 * Method which adds another phone number to existing person. In here we actually use methods
	 * from Person class.
	 * @param person
	 * @param newPhoneNumber
	 */
	public void addNewPhone(String person ,int newPhoneNumber){
		if(keys.contains(person)){
			phonebook.get(person).addNewPhoneNumber(newPhoneNumber);
		}else
		System.out.println("Couldn't find that person.");			
	}
	
	/**
	 * Method which removes number from existing person. Similar as adding new phonenumber.
	 * @param person
	 * @param newPhoneNumber
	 */
	public void removePhoneNumber(String person ,int newPhoneNumber){
		if(keys.contains(person)){
			phonebook.get(person).removeNumber(newPhoneNumber);
		}else
		System.out.println("Couldn't find that person.");			
	}
	
	/**
	 * Method which prints info of just one selected user.
	 * @param name
	 */
	public void printPerson(String name){
		if(keys.contains(name)){
			System.out.println(phonebook.get(name).toString());
		}else
			System.out.println("Couldn't find that person in phonebook");
	}
	
	/**
	 * Method that adds whole new person into our phonebook.
	 * @param name
	 * @param number
	 */
	public  void addNewPerson(String name, int number){
		phonebook.put(name, new Person(name, number));
	}
	
	/**
	 * Method which removes whole person from our phonebook
	 * @param name
	 */
	public  void removePerson(String name){
		if(keys.contains(name))
			keys.remove(name);
		else
			System.out.println("Couldn't find that person in phonebook");
	}	
	
}
