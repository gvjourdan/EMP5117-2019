public class Fibonacci {
	public static void main(String[] args){
		int current, prev, fib;
		prev = 0;
		current = 1;
		System.out.println("F(0) = 0");
		System.out.println("F(1) = 1");
		for(int i = 2; i < 20; i++) {
			fib = current + prev;
			prev = current;
			current = fib;
			System.out.println("F(" + i + ") = " + fib );
		}

		System.out.println("Another way, this time using an Array:");
		int[] fibonacciArray;
		fibonacciArray = new int[20];
		fibonacciArray[0] = 0;
		fibonacciArray[1] = 01;
		for(int i = 2; i < 20; i++) {
			fibonacciArray[i] = fibonacciArray[i-1] +  fibonacciArray[i-2];  
		}
		// printing the results:
		for(int i = 0; i < 20; i++) {
			System.out.println("F(" + i + ") = " + fibonacciArray[i]);
		}
	}
}