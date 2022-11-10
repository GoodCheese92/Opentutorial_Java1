package org.opentutorials.javatutorials.a20221020;

public class WhileDemo {

	public static void main(String[] args) {
		int i = 0;
		// i의 값이 10보다 작다면 true, 크다면 false가 된다. 현재 i의 값이 0이기 때문에 true.
		while (i < 10) {
			System.out.println("Coading Everyday" + i);
			// i의 값에 1을 더한다. 반복문의 중괄호의 마지막 라인에 도달하면 i의 값이 1이 더해지고 10이 되는 순간 반복문의 끝에
			// 도달한다.
			i++;
		}
	

	}

}
