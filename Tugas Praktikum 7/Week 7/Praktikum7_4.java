/**
 * Praktikum7_3
 */
public class Praktikum7_4 {

    public static void main(String[] args) {
        
	        int[][] matrixA = {
	            {3, 3, 3},
	            {3, 3, 3},
	            {3, 3, 3}
	        };

	        int[][] matrixB = {
	            {3, 3, 3},
	            {3, 3, 3},
	            {3, 3, 3}
	        };

	        int rows = matrixA.length;
	        int cols = matrixA[0].length;

	        int[][] matrixC = new int[rows][cols];

	       
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
	            }
	        }

	       
	        System.out.println("Elemen Matrix A:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.println("A[" + i + "][" + j + "] : " + matrixA[i][j]);
	            }
	        }

	      
	        System.out.println("Elemen Matrix B:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.println("B[" + i + "][" + j + "] : " + matrixB[i][j]);
	            }
	        }

	      
	        System.out.println("Hasil A + B");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.println("C[" + i + "][" + j + "] : " + matrixC[i][j]);
                }
            }
	    }
    }
