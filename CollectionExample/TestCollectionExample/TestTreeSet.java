package TestCollectionExample;


import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
			
			Set<Object> tree= new TreeSet<>();
			
			//Adding objects to the TreeSet
			tree.add("One");
			tree.add("Five");
			tree.add("Light");
			tree.add("Three");
			tree.add("Night");
			
			tree.stream().forEach((tree1)-> System.out.println(tree1));

		}

}

