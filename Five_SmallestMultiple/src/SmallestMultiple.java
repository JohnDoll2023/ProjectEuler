public class SmallestMultiple {
	public static void main(String[] args) {
		System.out.println(smallestMultiple(20));
	}
	
	public static int smallestMultiple(int x) {
		int i = 0;
		boolean divisible = false;
		while(!divisible) {
			int num = x * ++i;
			divisible = true;
			for(int j = 2; j < x; j++) {
				if(num % j != 0)
					divisible = false;
			}
		}
		return x * i;
	}
}
