package ch06.sec15;

import java.security.Signature;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
}
