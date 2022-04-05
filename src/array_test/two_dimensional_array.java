package array_test;

public class two_dimensional_array {

	int[][] a = new int [3][4];
	String [][] b= new String[4][6];
	
	
	static int [][] num = {{4,6,2},{4,3,2}};
	
	
	public static void main(String[] args) {
		

		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
	}
}
