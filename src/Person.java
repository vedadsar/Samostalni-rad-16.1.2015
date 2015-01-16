import java.util.Iterator;
import java.util.LinkedList;


public class Person {
	private String name;
	private LinkedList<Integer> phoneNumbers;
	
	
	public Person(String name, int phoneNumber){
		this.name = name;
		phoneNumbers = new LinkedList<Integer>();
		phoneNumbers.add(phoneNumber);
	}
	
	public void addNewPhoneNumber(int newNumber){
		phoneNumbers.add(newNumber);
	}
	
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

	public String getName() {
		return name;
	}


	public LinkedList<Integer> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(LinkedList<Integer> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	
}
