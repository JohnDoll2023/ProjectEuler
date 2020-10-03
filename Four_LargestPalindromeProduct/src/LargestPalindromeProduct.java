public class LargestPalindromeProduct {
	public static void main(String[] args) {
		System.out.println(largestPalindromeProduct());
	}
	
	public static int largestPalindromeProduct() {
		boolean value = true;
		int largest = 0;
		for(int i = 999; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				String y = ((Integer)(i*j)).toString();
				if(i * j < largest) 
					break;
				value = true;
				for(int k = 0; k < y.length()/2; k++) {
					if(y.charAt(k) != y.charAt(y.length() - 1 - k)) {
						value = false;
						break;
					}
				}
				if(value) {
					largest = i*j;
					break;
				}
				
			}
		}
		return largest;
	}
}
