package org.opentutorials.javatutorials.a20221026;

public class ScopeDemo2 {
	static int i = 5;
	
	static void a() {
		int i = 10;
		b();
	}
	
	static void b() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		int i = 1;
		a();

	}

}
