public class LargestPrimeFactors {
	public static void main(String[] args) {
		System.out.println(factors());
	}
	
	public static long factors() {
		long number = 600851475143L;
		for(long i = 2; i < number; i++) {
			if(number % i == 0)
				number /= i--;
		}
		return number;
	}
}