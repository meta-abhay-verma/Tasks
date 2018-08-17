package com.meta.tasks.scftest;

public class MagicSquare {
	private int[][] matrix;
	private boolean isSolutionFound;
	private boolean[] isValueUsed;
	final int size;
	final int expectedSum;
	
	public MagicSquare(int size){
		this.size = size;
		this.expectedSum = size*(size*size + 1) / 2;
		this.matrix = new int[size][size];
		isValueUsed = new boolean[size*size+1];
	}
	
	public static MagicSquare getSolution(int size){
		MagicSquare magicSquare = new MagicSquare(size);
		magicSquare.isSolutionFound = magicSquare.solve(0,0,0);
		return magicSquare;
	}

	private boolean solve(int row, int column, int sum) {
		if (sum > expectedSum)
			return false;
		if (column == size)
			return sum == expectedSum && solve(row+1,0,0);
		if (row == size)
			return true;
		
		for (int value = 1; value< isValueUsed.length; value++){
			
			if (!isValueUsed[value]){
				isValueUsed[value] = true;
				matrix[row][column] = value;
				if (solve(row,column+1,sum+value))
					return true;
				isValueUsed[value] = false;
			}
			
		}
		return false;
	}

	/** @return the matrix */
	public int[][] getMatrix() {
		return matrix;
	}

	/** @return the isSolutionFound */
	public boolean isSolutionFound() {
		return isSolutionFound;
	}
	
	public static void main(String[] args) {
		int size = 5;
		MagicSquare magicSquare = MagicSquare.getSolution(size);
		
		System.out.println(magicSquare.isSolutionFound);
		
		for (int i=0;i<size;i++){
			int sum = 0;
			for (int j=0;j<size;j++){
				System.out.print(magicSquare.getMatrix()[i][j]+" ");
				sum +=magicSquare.getMatrix()[i][j];
			}
			System.out.println("SUM = "+sum);
		}
	}
	
}
