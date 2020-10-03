public class EvenFibonacci {
	
	static int count = 0;
	
	public static void main(String[] args) {
		fibonacci(10);
		System.out.println(count);
	}
	
	public static int fibonacci(int n) {
		if(n <= 1)
			return 1;
		if(n % 2 == 0)
			count++;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}