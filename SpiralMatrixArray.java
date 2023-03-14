package arrayLearning;

public class SpiralMatrixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print below Spiral Matrix
		// 1 2 3 4
		// 12 13 14 5
		// 11 16 15 6
		// 10 9 8 7

		int minCol = 0, maxCol = 3, minRow = 0, maxRow = 3;
		int no = 1;
		int ar[][] = new int[4][4];
		while (no <= 16) {
			for (int col = minCol; col <= maxCol; col++) {
				ar[minRow][col] = no;
				no++;
			}
			minRow++;
			for (int row = minRow; row <= maxRow; row++) {
				ar[row][maxCol] = no;
				no++;
			}
			maxCol--;
			for (int col = maxCol; col >= minCol; col--) {
				ar[maxRow][col] = no;
				no++;
			}
			maxRow--;
			for (int row = maxRow; row >= minRow; row--) {
				ar[row][minCol] = no;
				no++;
			}
			minCol++;
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

		// Print below Spiral Matrix
		// 4 3 2 1
		// 5 14 13 12
		// 6 15 16 11
		// 7 8 9 10

		int minCol = 0, maxCol = 3, minRow = 0, maxRow = 3;
		int no = 1;
		int ar[][] = new int[4][4];
		while (no <= 16) {
			for (int col = maxCol; col >= minCol; col--) {
				ar[minRow][col] = no;
				no++;
			}
			minRow++;
			for (int row = minRow; row <= maxRow; row++) {
				ar[row][minCol] = no;
				no++;
			}
			minCol++;
			for (int col = minCol; col <= maxCol; col++) {
				ar[maxRow][col] = no;
				no++;
			}
			maxRow--;
			for (int row = maxRow; row >= minRow; row--) {
				ar[row][maxCol] = no;
				no++;
			}
			maxCol--;
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

		// Print below Spiral Matrix
		// 13 14 15 16
		// 12 3 4 5
		// 11 2 1 6
		// 10 9 8 7

		int minCol = 0, maxCol = 3, minRow = 0, maxRow = 3;
		int no = 16;
		int ar[][] = new int[4][4];
		while (no >= 1) {
			for (int col = maxCol; col >= minCol; col--) {
				ar[minRow][col] = no;
				no--;
			}
			minRow++;
			for (int row = minRow; row <= maxRow; row++) {
				ar[row][minCol] = no;
				no--;
			}
			minCol++;
			for (int col = minCol; col <= maxCol; col++) {
				ar[maxRow][col] = no;
				no--;
			}
			maxRow--;
			for (int row = maxRow; row >= minRow; row--) {
				ar[row][maxCol] = no;
				no--;
			}
			maxCol--;
					}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

		// Print below Spiral Matrix
		// 16 15 14 13
		// 5 4 3 12
		// 6 1 2 11
		// 7 8 9 10

		int minCol = 0, maxCol = 3, minRow = 0, maxRow = 3;
		int no = 16;
		int ar[][] = new int[4][4];
		while (no >= 1) {
			for (int col = minCol; col <= maxCol; col++) {
				ar[minRow][col] = no;
				no--;
			}
			minRow++;
			for (int row = minRow; row <= maxRow; row++) {
				ar[row][maxCol] = no;
				no--;
			}
			maxCol--;
			for (int col = maxCol; col >= minCol; col--) {
				ar[maxRow][col] = no;
				no--;
			}
			maxRow--;
			for (int row = maxRow; row >= minRow; row--) {
				ar[row][minCol] = no;
				no--;
			}
			minCol++;
					}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

		// Print below Spiral Matrix
		// 1 2 3 4 5
		// 16 17 18 19 6
		// 15 24 25 20 7
		// 14 23 22 21 8
		// 13 12 11 10 9

		int minCol = 0, maxCol = 4, minRow = 0, maxRow = 4;
		int no = 1;
		int ar[][] = new int[5][5];
		while (no <= 25) {
			for (int col = minCol; col <= maxCol; col++) {
				ar[minRow][col] = no;
				no++;
			}
			minRow++;
			for (int row = minRow; row <= maxRow; row++) {
				ar[row][maxCol] = no;
				no++;
			}
			maxCol--;
			for (int col = maxCol; col >= minCol; col--) {
				ar[maxRow][col] = no;
				no++;
			}
			maxRow--;
			for (int row = maxRow; row >= minRow; row--) {
				ar[row][minCol] = no;
				no++;
			}
			minCol++;
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

		// Print below Spiral Matrix
		// 1 2 3 4 5 6 7 8 9 10
		// 36 37 38 39 40 41 42 43 44 11
		// 35 64 65 66 67 68 69 70 45 12
		// 34 63 84 85 86 87 88 71 46 13
		// 33 62 83 96 97 98 89 72 47 14
		// 32 61 82 95 100 99 90 73 48 15
		// 31 60 81 94 93 92 91 74 49 16
		// 30 59 80 79 78 77 76 75 50 17
		// 29 58 57 56 55 54 53 52 51 18
		// 28 27 26 25 24 23 22 21 20 19

		int minCol = 0, maxCol = 9, minRow = 0, maxRow = 9;
		int no = 1;
		int ar[][] = new int[10][10];
		while (no <= 100) {
			for (int col = minCol; col <= maxCol; col++) {
				ar[minRow][col] = no;
				no++;
			}
			minRow++;
			for (int row = minRow; row <= maxRow; row++) {
				ar[row][maxCol] = no;
				no++;
			}
			maxCol--;
			for (int col = maxCol; col >= minCol; col--) {
				ar[maxRow][col] = no;
				no++;
			}
			maxRow--;
			for (int row = maxRow; row >= minRow; row--) {
				ar[row][minCol] = no;
				no++;
			}
			minCol++;
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

}
