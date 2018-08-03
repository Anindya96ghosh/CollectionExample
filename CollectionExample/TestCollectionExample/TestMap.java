package TestCollectionExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class TestMap {
	public static void main(String[] args) {
				Map<String, String> map= new HashMap<>();
				
				//Adding objects to the Map
				map.put("Anindya", "Pineapple");
				map.put("Ghosh", "apple");
				map.put("Sayali", "Mango");
				map.put("Mehek", "Pasta");
				
				Set<Entry<String, String>> set= map.entrySet();
				
				set.stream().forEach((e)-> System.out.println(e.getKey() + " "+ e.getValue()));
				
				Set <String> keyset = map.keySet();
				System.out.println("Key set values are: " + keyset);

			}

	}

