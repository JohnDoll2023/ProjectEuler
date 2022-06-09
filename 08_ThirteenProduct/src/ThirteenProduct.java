import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThirteenProduct {
	public static void main(String[] args) {
		try {
			System.out.println(product(new Scanner(new File("thirteenproduct.txt"))));
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
	
	public static long product(Scanner in) {
		int numbers[] = new int[1000];
		int i = 0;
		int count = 1;
		while(in.hasNextLine()) {
			String x = in.nextLine();
			for(i = i; i < count * x.length(); i++) {
				numbers[i] = x.charAt(i % x.length()) - 48;
			}
			count++;
		}
		
		long largest = 0L;
		for(int j = 0; j < 988; j++) {
			if(numbers[j+12] == 0) 
				j += 12;
			else {
				long first = numbers[j] * numbers[j+1] * numbers[j+2] * numbers[j+3] * numbers[j+4] * numbers[j+5];
				long number = first * numbers[j+6] * numbers[j+7] * numbers[j+8] * numbers[j+9] * numbers[j+10] * numbers[j+11] * numbers[j+12];
				if(number > largest) {
					largest = number;
				}
			}
		}
		return largest;
	}
}