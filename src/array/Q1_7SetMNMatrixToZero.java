package array;

public class Q1_7SetMNMatrixToZero {
	public void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		// store the row and column index with value 0
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; i < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		// set arr[i][j] to 0 either row i or column j has a 0
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; i < matrix[0].length; j++) {
				if(row[i]||column[j]){
					matrix[i][j]=0;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
