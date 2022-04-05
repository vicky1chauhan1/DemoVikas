package polymorphism;

public class Over_riding_2 {

	public static void getAuto() {
		System.out.println("helooo_2");
	}
	
	public static void main(String[] args) {
		Over_riding_1 ab = new Over_riding_1();
		ab.getAuto();
		
		Over_riding_2 xy = new Over_riding_2();
		xy.getAuto();
	}
}
