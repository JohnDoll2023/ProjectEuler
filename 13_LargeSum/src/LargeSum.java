import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LargeSum {

	public static void main(String[] args) {
		try {
			File file = new File("numbers.txt");
			Scanner in = new Scanner(file);
			System.out.println(largeSum(in));
		} catch (FileNotFoundException e) {
			System.out.println("Unable to access file.");
		}
	}
	
	public static int largeSum(Scanner file) {
		int sum = 0;
		String [] arr = new String[100];
		int row = 0;
		while(file.hasNextLine()) {
			arr[row] = file.next();
			System.out.println(arr[row]);
			row++;
		}
		return 0;
	}
}