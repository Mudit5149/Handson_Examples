package java_class_examples;

public class Example1Recursion {
	static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
			
		}
		else {
			return n* factorial(n* n-1);
		}
		
	}
	public static void main(String[] args) {
		int x = 4;
		System.out.print("the value of factorial n is:" +factorial(x));
	}

}
