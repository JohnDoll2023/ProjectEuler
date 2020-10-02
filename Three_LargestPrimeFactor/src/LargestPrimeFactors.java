
public class LargestPrimeFactors {
	public static void main(String[] args) {
		long number = 600851475143L;
		long i = 2;
		while(i < number) {
			if(number % i == 0) {
				number /= i;
				i--;
			}
			i++;
		}
	}
}
