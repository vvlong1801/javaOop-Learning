package lab02;

public class AddTwoMatrices {
	private int [][]mat1;
	private int [][]mat2;
	
	public static AddTwoMatrices(int[][] mat1, int[][] mat2) {
		this.mat1 = mat1;
		this.mat2 = mat2;
	};
	public int[][] getmat1() {
		return mat1;
	}
	public void setmat1(int[][] mat1) {
		this.mat1 = mat1;
	}
	public int[][] getmat2() {
		return mat2;
	}
	public void setmat2(int[][] mat2) {
		this.mat2 = mat2;
	}

	public boolean checkSize() {
		if(mat1.length != mat2.length)return false;
		else if(mat1[0].length != mat2[0].length) return false;
		else return true;
	}

	public void sumMatrix() {
		boolean checkMatrixSize = checkSize();
		if(checkMatrixSize == false) {
			System.out.println("Hai matrix không cùng size");
			return;
		}
		int row = mat1.length;
		int column = mat1[0].length;
		
		int [][]sum = new int[row][column];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				sum[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main() {
		int[][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] m2 = {{-1,-2,-3},{-4,-5,-6},{-7,-8,-9}};
		AddTwoMatrices ATM = new AddTwoMatrices(m1,m2);
		ATM.sumMatrix();
	}
	
	
}
