package org.opentutorials.javatutorials.a20221123;

class B {
	private int[] arr = new int[3];
	
	B() { 
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;		
	}
	
	public void z(int first, int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
	}
}

public class Exception3 {
	public static void main(String[] args) {
		B b = new B();
		
		b.z(10, 0);
		b.z(1, 0);
		b.z(2, 1);
	}
}

/*
 try {
 	예외의 발생이 예상되는 로직
 } catch (예외클래스 인스턴스) {
 	예외가 발생했을 때 실행되는 로직
 } finally {
 	예외여부와 관계 없이 실행되는 로직
 }
 */
