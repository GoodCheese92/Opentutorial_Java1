package org.opentutorials.javatutorials.a20221122;

class A {
	public String y() {
		return "public String y()";
	}
	
	private String z() {
		return "public String z()";
	}
	
	public String x() {
		return z();
	}
	
}

public class Acessmodifier1 {
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.y());
		// System.out.println(a.z());
		// 메서드가 private로 선언되었기 때문에 에러 발생
		System.out.println(a.x());
		
	}
}
