//2) Write java code to demonstrate usage of below collections framework class 
//a) ArrayList b) LinkedList c) HashMap d) LinkedHashMap e) HashSet f) LinkedHashSet g) TreeSet h) TreeMap

package java_collections;
import java.util.*;

public class Problem01 {
	private static void arrayList() {
		//ArrayList
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
	
		list.get(0);
		
		list.set(0, 40);
		
		list.remove(1);
		
	}
	
	private static void linkedList() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(10);
		linkedList.add(0, 20);
		
		linkedList.get(0);
		
		linkedList.set(0, 30);
		
		linkedList.remove(1);
	}
	
	private static void hashMap() {
		HashMap<Integer, String> numbers = new HashMap<>();
		
		numbers.put(1, "Shubham");
		numbers.put(2, "Ram");
		
		numbers.get(1);
		
		numbers.replace(2, "Vivek");
		
		numbers.remove(1);
	}
	
	private static void linkedHashMap() {
		LinkedHashMap<Integer, String> numbers = new LinkedHashMap<>();
		
		numbers.put(1, "one");
		numbers.put(2, "two");
		
		numbers.entrySet();
		numbers.get(1); // returns null if key not present
		
		numbers.remove(1);
	}
	
	private static void hashSet() {
		HashSet<Integer> numbers = new HashSet<>();
		
		numbers.add(1);
		numbers.add(2);
		
		Iterator<Integer> iterate = numbers.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		numbers.remove(1);
	}
	
	private static void linkedHashSet() {
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
		
		numbers.add(1);
		numbers.add(2);
		
		Iterator<Integer> iterate = numbers.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		numbers.remove(1);
	}
	
	private static void treeSet() {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(1);
		numbers.add(2);
		
		Iterator<Integer> iterate = numbers.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		numbers.remove(2);
		
		numbers.first();
		numbers.last();
	}
	
	private static void treeMap() {
		TreeMap<Integer, String> treemap = new TreeMap<>();
		
		treemap.put(1, "one");
		treemap.put(2, "two");
		
		treemap.entrySet();
		treemap.values();
		treemap.keySet();
		
		treemap.get(1);
		
		treemap.remove(1);
		
		treemap.replace(1, "value-->one");
	}
	
	public static void main(String[] args) {
		arrayList();
		linkedList();
		hashMap();
		linkedHashMap();
		hashSet();
		linkedHashSet();
		treeSet();
		treeMap();
		
	}

}
