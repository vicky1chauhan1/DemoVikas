package Encapsulation;

public class Main_class_to_call {

	
	public static void main(String[] args) {
		encapsulation_test obj = new encapsulation_test();
		
		obj.setNumber(25);
		int nUmber = obj.getNUmber();
		System.out.println(nUmber);
	}
}
