import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GridProduct {

	public static void main(String[] args) {
		try {
			File file = new File("gridproduct.txt");
			Scanner in = new Scanner(file);
			System.out.println(gridProduct(in));
		} catch (FileNotFoundException e) {
			System.out.println("Unable to locate file.");
		}
	}
	
	public static int gridProduct(Scanner file) {
		int [][] grid = new int[20][20];
		int row1 = 0;
		while(file.hasNextLine()) {
			for (int col = 0; col < 20; col++) {
				grid[col][row1] = file.nextInt();
			}
			row1++;
		}
		int max = 0;
		for (int row = 0; row < 20; row++) {
			for (int col = 0; col < 20; col++) {
				// diagonal down right
				int loc = grid[col][row];
				if (row <= 16 && col <= 16) {
					max = Math.max(loc * grid[col + 1][row + 1] * grid[col + 2][row + 2] *  grid[col + 3][row + 3], max);
					max = Math.max(loc * grid[col][row + 1] * grid[col][row + 2] * grid[col][row + 3], max);
					max = Math.max(loc * grid[col + 1][row] * grid[col + 2][row] * grid[col + 3][row], max);
				} else if (col <= 16) {
					// right
					max = Math.max(loc * grid[col + 1][row] * grid[col + 2][row] * grid[col + 3][row], max);
				} else if (row <= 16) {
					// down
					max = Math.max(loc * grid[col][row + 1] * grid[col][row + 2] * grid[col][row + 3], max);
				}
				// diagonal up right
				if (row >= 3 && col <= 16) {
					max = Math.max(loc * grid[col + 1][row - 1] * grid[col + 2][row - 2] *  grid[col + 3][row - 3], max);
				}
			}
		}
		return max;
	}
}