public class fib{
	public static int fib(int n) {
		// implementation using loop/iterative method. O(n) time complexity and O(1) space complexes. 
		int fib0 = 0;
			if (n == 0) {
				return 0;
			}
		int fib1 = 1;
			if (n == 1) {
				return 1;
			}
		for (int i = 2; i <= n; i++) {
			int temp = fib1;
			fib1 = fib0 + fib1;
			fib0 = temp;			
		}
		return fib1;
	}
	
	public static int fib1(int n) {
		// implementation using recursion
		return (n<=1)? n: fib1(n-1) + fib1(n-2);	
	}
	
	public static void main(String[] args) {
		int input = 9;
		System.out.println(fib(input));
		System.out.println(fib1(input));
	}
}

