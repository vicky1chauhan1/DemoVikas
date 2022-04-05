package array_test;

public class three_dimensional_array {

	int[][][] apple = new int[2][3][4];
	
	static String[][][] name = {{{"as","sd","sds"},{"ed","ws","dw"}}};
	
	public static void main(String[] args) {
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<name[i].length; j++) {
				for(int k=0; k<name[i][j].length; k++) {
					System.out.print(name[i][j][k]+"  ");
				}
				System.out.println();
			}
			
		}
	}
}
