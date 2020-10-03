public class Prime10001 {
	public static void main(String[] args) {
		System.out.println(prime());
	}
	
	public static int prime() {
		int count = 0;
		int i = 2;
		boolean value;
		while(count <= 10001) {
			value = true;
			for(int j = 2; j < i/2; j++) {
				if(i % j != 0)
					value = false;
			}
			i++;
			if(value)
				count++;
		}
		return --i;
	}
}