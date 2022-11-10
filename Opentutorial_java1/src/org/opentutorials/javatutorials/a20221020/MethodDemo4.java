package org.opentutorials.javatutorials.a20221020;

public class MethodDemo4 {
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i<limit) {
			output += i;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(0, 10);
		System.out.println(result);
		
	}
}
