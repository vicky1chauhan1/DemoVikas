package polymorphism;

public class Method_Overloading {

	public static void abc() {
		System.out.println("hiiiiiiiiiiiiiii");
	}
	public static void abc(String abc) {
		System.out.println(abc);
	}
	
	public static void main (String args[]) {
		abc("aa");
	}
}
