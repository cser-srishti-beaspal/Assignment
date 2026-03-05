/**
 * 
 */
package collections_framework_hashset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 
 */

public class JavaApp {
	public static void execution() {
		HashSet hs1 = new HashSet();
		hs1.add(10);hs1.add(true);hs1.add('j');
		hs1.add(12.33);hs1.add("java");hs1.add(new Product(1,"Apsara","Pencil",29.99));
		hs1.add(null);
		hs1.add(null);//only single null
		hs1.add(10);//not allowed
		System.out.println(hs1);
		
		HashSet<Character> hs2 = new HashSet<Character>();
		hs2.add('a');hs2.add('I');hs2.add('5');
		hs2.add('*');hs2.add('w');hs2.add('e');
		
		Iterator<Character> iterator = hs2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		hs2.remove('*');
		System.out.println(hs2);
		
		
		
		
		
		
	}

}


//public class JavaApp {
//	public static void execution() {
//		HashSet<Character> hs1 = new HashSet<Character>();
//		hs1.add('a');hs1.add('I');hs1.add('5');
//		hs1.add('*');hs1.add('w');hs1.add('e');
//		
//		System.out.println(hs1);
//		
//		HashSet<Character> hs2 = (HashSet<Character>) hs1.clone();
//		System.out.println(hs2);
//		
//		System.out.println(hs1.equals(hs2));
//		
//		System.out.println(hs1.hashCode());
//		System.out.println(hs1.hashCode());
//		
//		
//	}
//
//}
