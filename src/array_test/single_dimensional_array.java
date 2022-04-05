package array_test;

public class single_dimensional_array {

	int[] num; // declare
	String[] name; // declare

	int[] abc = new int[4];

	static int[] data = { 2, 45, 12 };
	
	
	public static void main(String[] args) {
		forEach();
		demo();
		
	}

	public static void demo() {

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
	
	public static void forEach() {
		
		for(int a : data) {
			System.out.println("for each loop "+a);
		}
	}

	
}
