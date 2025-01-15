import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum {

	public static void main(String[] args) {
		String filePath =  System.getProperty("user.dir") + "/13_LargeSum/numbers.txt";
		try {
			File file = new File(filePath);
			Scanner in = new Scanner(file);
			System.out.println("Sum: " + largeSum(in));
		} catch (FileNotFoundException e) {
			System.out.println("Unable to access file.");
		}
	}
	
	public static String largeSum(Scanner file) {
		BigInteger sum = BigInteger.ZERO;
		while(file.hasNextLine()) {
			sum = sum.add(new BigInteger(file.next()));
		}

		return sum.toString().substring(0, 10);
	}
}