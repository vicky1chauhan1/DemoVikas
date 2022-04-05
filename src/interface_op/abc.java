package interface_op;

public class abc implements data1 , data_2{

	@Override
	public void test1() {
		System.out.println("hiiiiii");
		
	}

	@Override
	public void hello() {
		System.out.println("byeeeeeeeeeeee");
		
	}
	
	public static void main(String[] args) {
		abc ab = new abc();
		ab.test1();
		ab.hello();
	}

}
