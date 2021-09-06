/**
 * 
 */
package com.rajesh.learner.cache;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author rkumar4
 *
 */
public class LRUCacheImpl {
	
	int capacity = 4;

	Deque<Integer> queue = new LinkedList<Integer>();
	
	Map<Integer, String> refMap = new HashMap<Integer, String>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LRUCacheImpl impl = new LRUCacheImpl();
		
		impl.put(1, "1_Cache");
		impl.put(2, "2_Cache");
		impl.put(4, "4_Cache");
		System.out.println(impl.get(2));
		impl.put(3, "3_Cache");
		impl.put(4, "4_Cache");
		impl.put(5, "5_Cache");
		System.out.println(impl.get(1));
//		System.out.println(impl.get(2));
		impl.put(2, "2_Cache");
		impl.put(2, "2_Cache");
		impl.put(6, "6_Cache");
		impl.put(4, "4_Cache");
		System.out.println(impl.get(3));

	}
	
	public String get(Integer keyName) {
		
		if (refMap.containsKey(keyName)) {
			String value = refMap.get(keyName);
			queue.remove(keyName);
			queue.addFirst(keyName);
			System.out.println("Queue after View: " + queue.toString());
			return value;
		}
		System.out.println("Not Found!!");
		return null;
	}
	
	public void put(Integer keyName, String Value) {
		
		if (refMap.containsKey(keyName)) {
			queue.remove(keyName);
		} else if (queue.size() == capacity) {
			Integer temp = queue.removeLast();
			refMap.remove(temp);
		}
		queue.addFirst(keyName);
		refMap.put(keyName, Value);	
		System.out.println("Queue after Insertion: " + queue.toString());
	}
	
	
}
