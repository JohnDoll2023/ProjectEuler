
public class LargestPalindromeProduct {
	public static void main(String[] args) {
		System.out.println(largestPalindromeProduct());
	}
	
	public static int largestPalindromeProduct() {
		for(int i = 999; i > 0; i--) {
			for(int j = 999; j > 0; i--) {
				String y = ((Integer)(i*j)).toString();
				for(int k = 0; k < y.length(); k++) {
					if(y.charAt(k) != y.charAt(y.length() - 1 - k)) {
						
					}
				}
			}
		}
		
		
		return 0;
	}
}
