import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;


public class Phonebook {	
	private  static HashMap<String, Person> phonebook; 
	private  static Set<String> keys;
	
	public Phonebook(){
		phonebook = new HashMap<String, Person>();
		keys = phonebook.keySet();
	}
	
	public static void printPhonebook(){
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
	
	public static void addNewPerson(String name, int number){
		phonebook.put(name, new Person(name, number));
	}
	
	public static void removePerson(String name){
		keys.remove(name);
	}
	
	
}
