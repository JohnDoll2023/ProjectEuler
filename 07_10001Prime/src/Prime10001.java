import java.util.ArrayList;
import java.util.List;

public class Prime10001 {
	public static void main(String[] args) {
		System.out.println(prime());
	}
	
	public static long prime() {
		int count = 0;
		
		// store prime numbers
		List<Integer> list = new ArrayList<>();
		
		// add first prime number
		list.add(2);
		
		// loop until 10,001st prime number is found
		while(++count < 10001) {
			
			// start is number to be determined whether or not is prime, we begin from previous prime + 1
			int start = list.get(count - 1) + 2;
			
			// loop thru arraylist of prime numbers, checking if start is divisible by them
			for (int i = 0; i < count && list.get(i) < (start/2 + 1); i++) {
				if (start % list.get(i) == 0) {
					start++;
					i = -1;
				}
			}
			list.add(start);
		}
		return list.get(count - 1);
	}
}