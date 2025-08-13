package forLoops;
import java.util.Scanner;

public class matrix_multipy {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in) ){
		
		//1ST MATRIX ROW COLUMN INPUT	
		System.out.print("ENTER THE ROW MATRIX FOR 1st MATRIX : ");
		int m_matrix_1 = input.nextInt();
		
		System.out.print("ENTER THE COLUMN FOR 1nd MATRIX : ");
		int n_matrix_1 = input.nextInt();
		
		int[][] matrix_1 =new int[m_matrix_1][n_matrix_1];
		
		//element for 1st matrix
				System.out.println("\n ENTER THE ELEMENT FOR 1st MATRIX : ");
				for( int i =0 ; i< m_matrix_1 ; i++ ) {
					for(int j =0 ; j<n_matrix_1 ; j++) {
						System.out.print(" ELEMENT [ "+(i+1) +"][ "+(j+1)+" ] : ");
						matrix_1[i][j]=  input.nextInt();
					}
				}
				
		//2ND MATRIX ROW COLUMN INPUT
		System.out.print("\n ENTER THE ROW MATRIX FOR 2st MATRIX : ");
		int m_matrix_2 = input.nextInt();
		
		System.out.print("ENTER THE COLUMN FOR 2nd MATRIX : ");
		int n_matrix_2 = input.nextInt();
		
		int[][] matrix_2 =new int[m_matrix_2][n_matrix_2];
		
		//element for 2nd matrix
		System.out.println("\n ENTER THE ELEMENT FOR 2nd MATRIX : ");
		for( int i =0 ; i< m_matrix_2 ; i++ ) {
			for(int j =0 ; j<n_matrix_2 ; j++) {
				System.out.print("ELEMENT [ "+(i+1) +"][ "+(j+1)+" ] : ");
				matrix_2[i][j]=  input.nextInt();
			}
		}
	
	//FOR RESULT
		int [][] result=new int[m_matrix_1][n_matrix_2];
		
		//multiplication
		for(int i=0 ; i<m_matrix_1; i++) {
			for(int j=0 ; j< n_matrix_2 ; j++) {
				result[i][j] = 0;
				for(int k=0 ; k < m_matrix_1 ; k++) {
					result[i][j] += matrix_1[i][k] * matrix_2[k][j];
					
				}
			}
		}
		
		//result
		System.out.println("\nTHE MATRIX MULTIPLICATION FOR MATRIX 1 AND MATRIX 2 IS : ");
		System.out.println("\n result matrix with "+m_matrix_1+" x "+n_matrix_2+" matrix :  \n");
		for(int i=0 ; i<m_matrix_1 ; i++) {
			for(int j=0 ; j<n_matrix_2 ; j++) {
				System.out.print(" "+result[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		}

	
	}
}

/*	int [][] numArray = {
{1,2,3},
{4,5,6},
{7,8,9}
};		
/* for(int i=0 ; i<numArray.length ; i++) {
	for (int j=0 ; j<numArray[i].length ; j++) {
		System.out.print(numArray[i][j]);
		
	}
	System.out.println();
}*/
