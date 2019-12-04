
public class Generics {
	
	OrderedPair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
	OrderedPair<String, String> p2 = new OrderedPair<>("Hello", "World");
	//OrderedPair<String, int> p3 = new OrderedPair<>("Odd", 7); //Primitive type can not be used in Generics
	
	
	public void print() {
		System.out.println(p1.getKey()+", "+p1.getValue());
		System.out.println(p2.getKey()+", "+p2.getValue());
	}
	

}

interface Pair<K, V> {
	public K getKey();
	public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
	private K key;
	private V value;
	
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() { return key; }
	public V getValue() { return value; }
}
