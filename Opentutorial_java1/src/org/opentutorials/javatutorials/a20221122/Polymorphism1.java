package org.opentutorials.javatutorials.a20221122;

class MyPoly1 {
	public void a(int num) {
		System.out.println("숫자출력");
		System.out.println(num);
	}
	
	public void a(String str) {
		System.out.println("문자출력");
		System.out.println(str);
	}
}

public class Polymorphism1 {
	public static void main(String[] args) {
		MyPoly1 po = new MyPoly1();
		
		po.a(1);
		po.a("Hello");
	}
}
