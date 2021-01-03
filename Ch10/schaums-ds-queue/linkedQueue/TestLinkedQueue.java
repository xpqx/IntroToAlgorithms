package queueDataStructure.linkedQueue;


public class TestLinkedQueue {
	public static void main(String[] args) {
		Queue crates = new LinkedQueue();
		crates.add("CARROTS");
		crates.add("ORANGES");
		crates.add("RAISINS");
		crates.add("PICKLES");
		crates.add("BANANAS");
		System.out.println("This is the Linked Stack Data Structure");
		System.out.println();
		System.out.println("crates.size(): " + crates.size() + "\tcrates.isEmpty():" + crates.isEmpty());
		
		System.out.println("crates.remove(): " + crates.remove());
		System.out.println("crates.remove(): " + crates.remove());
		System.out.println("crates.remove(): " + crates.remove());
		
		System.out.println("crates.size(): " + crates.size() + "\tcrates.isEmpty():" + crates.isEmpty());
		
		crates.add("WALNUTS");
		crates.add("OYSTERS");
		
		System.out.println("crates.size(): " + crates.size() + "\tcrates.isEmpty():" + crates.isEmpty());
		
		System.out.println("crates.remove(): " + crates.remove());
		System.out.println("crates.remove(): " + crates.remove());
		System.out.println("crates.remove(): " + crates.remove());
		System.out.println("crates.remove(): " + crates.remove());
		
		System.out.println("crates.size(): " + crates.size() + "\tcrates.isEmpty():" + crates.isEmpty());
		
	}

}

