
//to form a linked list for the given data
package TestCollectionExample;

import java.util.LinkedList;

import CollectionExample.Car;
import CollectionExample.CellPhone;
import CollectionExample.Laptop;
import CollectionExample.School;
import CollectionExample.Television;

public class TestList {

	public static void main(String[] args) {
	
		Laptop laptop[]=new Laptop[3];
		Car car[]=new Car[3];
		Television tv[]=new Television[3];
		CellPhone cell[]=new CellPhone[3];
		School school[]=new School[3];
		
		
		
		laptop[0]= new Laptop("Compaq",2000, "Windows", "i7");
		laptop[1]= new Laptop("Micromax", 2001, "Linux", "i5");
		laptop[2]= new Laptop("Apple",2002, "Ubuntu", "i3");
	
		car[0]= new Car("Honda", 3000, 2000, 20_00_000);
		car[1]= new Car("Wolkswagon", 3001, 2001, 20_00_001);	
		car[2]= new Car("Nano", 3002, 2002, 20_00_002);	
		
		tv[0]= new Television("Samsung",25_000,true, "LED");
		tv[1]= new Television("Videocon",35_000,false, "LCD");
		tv[2]= new Television("LG",45_000,true, "plasma");
		
		cell[0]= new CellPhone("Micromax", 400, "SnapDragon1" , "Dual Core" ,15_000);
		cell[1]= new CellPhone("LG", 401, "SnapDragon2" , "Hexa Core" ,16_000);
		cell[2]= new CellPhone("Lenovo", 402, "SnapDragon3" , "Quad Core" ,17_000);	
	
		school[0]=new School("ABC", "Mira Road", "Thane", 15);
		school[1]=new School("DEF", "Vasai", "Palghar", 12);
		school[2]=new School("GHI", "Dahisar", "Mumbai", 10);
		
		LinkedList<Object> list= new LinkedList<>();
		
		// adding objects to the list
		list.add(laptop[0]);
		list.add(laptop[1]);
		list.add(laptop[2]);
		
		list.add(car[0]);
		list.add(car[1]);
		list.add(car[2]);
		
		list.add(tv[0]);
		list.add(tv[1]);
		list.add(tv[2]);
		
		list.add(cell[0]);
		list.add(cell[1]);
		list.add(cell[2]);
		
		list.add(school[0]);
		list.add(school[1]);
		list.add(school[2]);
		
		list.stream().forEach((list1)-> System.out.println(list1));
		
		
	}

}
