package arrayAndStrings;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean setTopZero = false;
        boolean setLeftZero = false;
        
        for (int col = 0 ; col < matrix[0].length; col++ ) {
        	if (matrix[0][col] == 0) {
        		setTopZero = true;
        		break;
        	}
        } 
        
        for (int row = 0; row < matrix.length; row++) {
        	if (matrix[row][0] == 0) {
        		setLeftZero = true;
        		break;
        	}
        }
        
        for (int i = 0; i<matrix.length; i++) {
        	for (int j = 0; j<matrix[i].length; j++) {
        		if (matrix[i][j] == 0) {
        			matrix[i][0] = 0;
        			matrix[0][j] = 0;
        		}
        	}
        }
        
        for (int col =1  ; col < matrix[0].length; col++ ) {
        	if (matrix[0][col] !=0) continue;
        	for (int i =0; i< matrix.length; i++) matrix[i][col] =0;
        } 
        for (int row = 1; row < matrix.length; row++) {
        	if (matrix[row][0] !=0) continue;
        	for (int i =0; i< matrix[row].length; i++) matrix[row][i] =0;
        }
        
        if (setTopZero) {
            for (int col = 0 ; col < matrix[0].length; col++ ) {
            	matrix[0][col] =0;
            } 
        }
        if (setLeftZero) {
            for (int row = 0; row < matrix.length; row++) {
            	matrix[row][0] = 0;
            }
        }
        
    } 
}
