public class Board {
	public final int EDGE_LENGTH = 4;
	public final int BLACK = 1;
	public final int WHITE = 2;
	private int[][] grid; 

	public Board() {
		this.createGrid();
	}

	private void createGrid() {
		grid = new int[EDGE_LENGTH][EDGE_LENGTH];

		int x = 3;
		int y = 0;

		for (int i = 0; i < EDGE_LENGTH; i++) {
			for (int j = 0; j < EDGE_LENGTH; j++) {
				if (i == j && grid[i][j] == 0) {
					grid[i][j] = BLACK;
				}
				if (i == x && j == y && grid[i][j] == 0) {
					grid[i][j] = WHITE;
					x--;
					y++;
				}
			}
	}

	public boolean isGameOver() {
		if (isDiagSquare()) return true;
		if (isSmallSquare()) return true;
		if (isLargeSquare()) return true;
		if (isLine()) return true;
		return false;
	}

	public boolean isDiagSquare() {
		if (grid[1][1] != 0 && grid[1][1] == grid[2][2]) {
			if (grid[1][3] != 0 && grid[1][3] == grid[0][2] && grid[1][3] == grid[1][1]) {
				return true;
			}
			if (grid[2][0] != 0 && grid[2][0] == grid[3][1] && grid[2][0] == grid[1][1]) {
				return true;
			}		
		}
		if (grid[2][1] != 0 && grid[2][1] == grid[1][2]) {
			if (grid[1][0] != 0 && grid[1][0] == grid[0][1] && grid[1][0] == grid[2][1]) {
				return true;
			}
			if (grid[3][2] != 0 && grid[3][2] == grid[2][3] && grid[3][2] == grid[2][1]) {
				return true;
			}		
		}
		return false;	
	}

	public boolean isSmallSquare() {

	}

	public boolean isLargeSquare() {
		if (grid[0][0] == grid[3][3] && grid[0][3] == grid[3][0] && grid[0][0] == grid[0][3]) {
			return true;
		}
		return false;
	}

	public boolean isLine() {
		for (int i = 0; i < EDGE_LENGTH; i++) {
			for (j = 0; j < EDGE_LENGTH; j++) {

			}
		}
	}

	public static void main() {

	}
}