
public class SmallestMultiple {
	public static void main(String[] args) {
		System.out.println(smallestMultiple(20));
	}
	public static int smallestMultiple(int x) {
		int i = 0;
		boolean divisible = false;
		while(!divisible) {
			int num = x * i;
			divisible = true;
			for(int j = x + 1; j < num; j++) {
				if(num % j != 0)
					divisible = false;
			}
			i++;
		}
		return x * i;
	}
}
