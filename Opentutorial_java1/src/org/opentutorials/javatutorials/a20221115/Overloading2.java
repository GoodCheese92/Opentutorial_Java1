package org.opentutorials.javatutorials.a20221115;



public class Overloading2 {
	
	// overload를 할때
	// 1. 메서드의 자료형이 같아야 한다.
	// 2. 메서드의 매개변수의 자료형 또는 숫자가 달라야 한다.
	
	void A() {System.out.println("void A()");}
	void A(int arg1) {System.out.println("void A(int arg1)");}
	void A(String arg1) {System.out.println("void A(String arg1)");}
	// int A() {System.out.println("int A()");
	
	
	public static void main(String[] args) {
		Overloading2 mc = new Overloading2();
		mc.A();
		mc.A(1);
		mc.A("coading everyday");
		
	}
}
