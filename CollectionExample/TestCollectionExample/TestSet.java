package TestCollectionExample;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import CollectionExample.Car;
import CollectionExample.CellPhone;
import CollectionExample.Laptop;
import CollectionExample.School;
import CollectionExample.Television;

public class TestSet {

	public static void main(String[] args) {
	
		Laptop laptop[]=new Laptop[3];
		Car car[]=new Car[3];
		Television tv[]=new Television[3];
		CellPhone cell[]=new CellPhone[3];
		School school[]=new School[3];
	
		//Create instances of class Laptop
		laptop[0]= new Laptop("Micromax",2000, "Windows", "i7");
		laptop[1]= new Laptop("Micromax", 2000, "Linux", "i7");
		laptop[2]= new Laptop("Apple",2002, "Ubuntu", "i3");
	
		//Create instances of class Car
		car[0]= new Car("Honda", 3000, 2000, 20_00_000);
		car[1]= new Car("Nano", 3002, 2002, 20_00_002);		
		car[2]= new Car("Nano", 3002, 2012, 200002);	
		
		//Create instances of class Television	
		tv[0]= new Television("Samsung",25_000,true, "LED");
		tv[1]= new Television("Videocon",35_000,false, "LCD");
		tv[2]= new Television("Samsung", 25_000, false, "LED");
		
		
		//Create instances of class CellPhone
		cell[0]= new CellPhone("Micromax", 400, "SnapDragon1" , "Dual Core" ,15_000);
		cell[1]= new CellPhone("Lenovo", 402, "SnapDragon3" , "Quad Core" ,17_000);	
		cell[2]= new CellPhone("Lenovo", 402, "SnapDragon3" , "Dual Core" ,17500);	
		
	
		//Create instances of class School
		school[0]=new School("ABC", "Mira Road", "Thane", 15);
		school[1]=new School("ABC", "Mira Road", "Thane", 12);
		school[2]=new School("GHI", "Dahisar", "Mumbai", 10);
		
		Set<Object> set= new HashSet<>();
		
		//Adding objects to the HashSet
		set.add(laptop[0]);
		set.add(laptop[1]);
		set.add(laptop[2]);
		
		set.add(cell[0]);
		set.add(cell[2]);
		set.add(cell[1]);
		
		set.add(car[0]);
		set.add(car[1]);
		set.add(car[2]);
		
		set.add(tv[0]);
		set.add(tv[1]);
		set.add(tv[2]);


		set.add(school[0]);
		set.add(school[1]);
		set.add(school[2]);

	
		
		
		set.stream().forEach((set1)-> System.out.println(set1));
		
		
	}

}
