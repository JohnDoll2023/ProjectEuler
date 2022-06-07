
public class Prime10001 {
	public static void main(String[] args) {
		System.out.println(prime());
	}
	
	public static long prime() {
		int count = 0;
		long i = 2L;
		boolean value;
		while(count <= 10001) {
			value = true;
			for(long j = 2L; j < i/2; j++) {
				if(i % j != 0) {
					value = false;
					break;
				}
			}
			i++;
			if(value)
				count++;
		}
		return i;
	}
}
