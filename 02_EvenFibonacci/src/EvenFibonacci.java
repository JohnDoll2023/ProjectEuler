
public class EvenFibonacci {

	static int count = 0;
	
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
		System.out.println(count);
	}
	
	public static int fibonacci(int n) {
		if(n <= 1)
			return 1;
		
		return count += ((fibonacci(n - 1) + fibonacci(n - 2)) % 2 == 0 ? 1 : 0) ;
	}

}
