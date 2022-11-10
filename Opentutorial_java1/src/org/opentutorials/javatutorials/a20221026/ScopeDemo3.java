package org.opentutorials.javatutorials.a20221026;

class C {
	int v = 10;
	
	void m() {
		System.out.println(v);
	}
}

public class ScopeDemo3 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();

	}

}
