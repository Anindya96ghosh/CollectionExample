package TestCollectionExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import CollectionExample.School;

public class TestLinkedList {

	public static void main(String[] args) {
		School school[]=new School[5];
	
		//Create instances of class School
		
		school[0]=new School("ABC", "Mira Road", "Thane", 15);
		school[1]=new School("DEF", "Vasai", "Palghar", 12);
		school[2]=new School("GHI", "Dahisar", "Mumbai", 10);
		school[3]=new School("XYZ", "Dahisar", "Boriwali", 17);
		school[4]=new School("GHI", "Dahisar", "Mumbai", 10);
		
		Set<Object> set= new LinkedHashSet<>();
		
		//Adding objects to the LinkedHashSet
		set.add(school[1]);
		set.add(school[0]);
		set.add(school[3]);
		set.add(school[4]);
		set.add(school[2]);
		
		set.stream().forEach((set1)-> System.out.println(set1));

	}

}
