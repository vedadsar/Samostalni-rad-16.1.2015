package com.testing.bitcamp.generics;

import com.testing.bitcamp.models.Book;
import com.testing.bitcamp.models.MachineBook;

public class CharacterCounter {
	
	public static<T> void count(T[] var){
		int counter = 0;
		for(T k: var){
			counter++;
		}
		System.out.println(counter);
	}
	
	public static int countWords(String[] array){
		
	}
	
	public static void main(String[] args) {
		Book b = new Book();
		b.setAutor("Vladimir Arsenijevic");
		b.setName("Predator");
		b.setPages(555);
		b.setText(new String[] {"A", "B", "C", "D","E"});
		
		int p = count(b.getText());
		System.out.println(p);
		
		System.out.println("--------------");
		
		MachineBook m = new MachineBook();
		m.setAutor("Vladimir Arsenijevic");
		m.setName("Predator");
		m.setPages(555);
		m.setText(new int[]{1 ,24, 13, 4, 5, 55, 64, 64});
		
		
		System.out.println(count(m.getText()));
	}
}
