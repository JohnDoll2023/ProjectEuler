import java.util.ArrayList;
import java.util.List;

public class Primes2_000_000 {

	public static void main(String[] args) {
		System.out.println(primes());
	}
	
	public static long primes() {
		// store list of primes for comparison
		List<Integer> primes = new ArrayList<>();
		long sum = 0;
		outer: for (int i = 2; i < 2_000_000; i++) {
			for (int j = 0; j < primes.size() && primes.get(j) < ((i / 2) + 1); j++) {
				// if it is divisible, it is not prime, continue outer loop as we no longer need to check this number i
				if (i % primes.get(j) == 0) {
					continue outer;
				}
			}
			primes.add(i);
			sum += i;
		}
		return sum;
	}
}