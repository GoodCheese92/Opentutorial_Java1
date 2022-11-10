package org.opentutorials.javatutorials.a20221020;

public class MethodDemo3 {
	public static void numbering(int init, int limit) {
		while(init<=limit) {
			System.out.println(init);
			init++;
		}
}
	
	public static void main(String[] args) {
		numbering(2, 8);
	}
		
}


