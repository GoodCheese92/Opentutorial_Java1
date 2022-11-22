package org.opentutorials.javatutorials.a20221122;

class AA {
	public String x() {
		return "AA.x";
	}
}

class BB extends AA {
	public String x() {
		return "BB.x";
	}
	
	public String y() {
		return "BB.y";
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		AA obj = new BB();	// AA 클래스를 자료형으로 선언, BB 클래스로 객체화
		
		obj.x();
		// obj.y();		// AA obj로 선언했기 때문에 AA 클래스에 존재하지 않는 메서드는 에러
		
		System.out.println(obj.x());	// AA 클래스에서 상속되는 BB 메서드만 실행되고 또한 가능함.
	}
}
