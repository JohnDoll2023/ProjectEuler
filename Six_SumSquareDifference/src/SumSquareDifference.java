public class SumSquareDifference {
	public static void main(String[] args) {
		System.out.println(difference());
	}
	
	public static int difference() {
		int squaredSum = 0;
		int squares = 0;
		for(int i = 1; i <= 100; i++) {
			squaredSum += i;
			squares += Math.pow(i, 2);
		}
		return (int) Math.pow(squaredSum, 2) - squares; 
	}
}