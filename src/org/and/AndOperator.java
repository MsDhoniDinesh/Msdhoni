package org.and;

public class AndOperator {

	private int returntype() {
		int A = 100, b = 200, c = 300;

	System.out.println("A = "+A+"\n"+"b = "+b+"\n"+"C = "+c);
		if (c < 200) {
			
		return A;
		}

		else {

			return c;
		}

		
	}

	public static void main(String[] args) {
		AndOperator R = new AndOperator();
		int V = R.returntype();

		System.out.println("Among A,B,C the greatest number is " + V);
	}

}
