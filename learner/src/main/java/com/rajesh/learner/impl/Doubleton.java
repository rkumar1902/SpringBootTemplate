/**
 * 
 */
package com.rajesh.learner.impl;

/**
 * @author rkumar4
 *
 */
public class Doubleton {
	
	Doubleton instance1;
	
	Doubleton instance2;
	
	private Doubleton() {
		
	}
	
	public Doubleton getInstance() {
		
		if (instance1 == null) {
			instance1 = new Doubleton();
			return instance1;
		} else if (instance2 == null) {
			instance2 = new Doubleton();
			return instance2;
		}
		
		if (Math.random()%2 == 1) {
			return instance1;
		} 
		return instance2;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
