import java.util.HashMap;
import java.util.Map;

public class CollatzSequence {

	public static void main(String[] args) {
		System.out.println(collatzSequence());
	}
	
	public static int collatzSequence() {
		// store solved collatz numbers
		Map<Integer, Integer> map = new HashMap<>();
		
		// keep track of number that had most steps
		int largest = 0;
		int maxSteps = 0;
		long start = 0L;
		outer: for (int i = 1; i < 1_000_000; i++) {
			// set start number equal to i for computations
			start = i;
			
			//track number of steps
			int steps = 0;
			
			// loop through collatz sequence
			while (start != 1) {
				
				// if number has already been logged, then return its number of steps
				if (map.containsKey(start)) {
					map.put(i, steps + map.get(start) - 1);
					if (map.get(i) > maxSteps) {
						largest = i;
						maxSteps = map.get(i);
					}
					continue outer;
				}
				
				// if even, divide by 2, else multiply by 3 and add 1
				if (start % 2 == 0) {
					start /= 2;
				} else {
					start = (start * 3) + 1;
				}
				steps++;
			}
			
			// add number to map and check if it has taken the largest number of steps
			map.put(i, steps);
			if (steps > maxSteps) {
				largest = i;
				maxSteps = steps;
			}
		}
		return largest;
	}
}