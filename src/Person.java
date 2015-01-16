import java.util.Iterator;
import java.util.LinkedList;

/**
 * Class person creates person for our phonebook. It contains name of person ( full name) and linked list of numbers.
 * @author Vedad_2
 *
 */
public class Person {
	private String name;
	private LinkedList<Integer> phoneNumbers;
	
	/**
	 * Constructor for our person class. 
	 * @param name
	 * @param phoneNumber
	 */
	public Person(String name, int phoneNumber){
		this.name = name;
		phoneNumbers = new LinkedList<Integer>();
		phoneNumbers.add(phoneNumber);
	}
	
	/**
	 * Adding new phonenumber to our person. Actually we are adding into linked list.
	 * @param newNumber
	 */
	public void addNewPhoneNumber(int newNumber){
		phoneNumbers.add(newNumber);
	}
	
	/**
	 * Removing number from our person.
	 * @param phoneNumber
	 */
	public void removeNumber(int phoneNumber){
		int idx = 0;
		if(idx > phoneNumbers.size() || idx < 0)
			throw new IndexOutOfBoundsException("Not possible to remove number at that index");
		
		Iterator it = phoneNumbers.iterator();		
		
		while(it.hasNext() && phoneNumbers.get(idx) != phoneNumber){
			idx++;
			it.next();			
		}		
		phoneNumbers.remove(idx);		
	}

	@Override
	public String toString() {
		return "Person:" + name + "\n PhoneNumbers=" + phoneNumbers.toString();
	}
	
	/**
	 * Get method for our linked list. Return linked list of phone numbers.
	 * @return
	 */
	public LinkedList<Integer> getPhoneNumbers() {
		return phoneNumbers;
	}

}
