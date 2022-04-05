package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class collection_test {
	
	static ArrayList<Integer> data = new ArrayList<Integer>();
	static HashSet<Integer> HS = new HashSet<Integer>();
	static TreeSet<String> Ts = new TreeSet<String>();
	static HashMap<String, Integer> HM = new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		data.add(20);
		System.out.println(data);
	
	
	    HS.add(56);
	    System.out.println(HS);
	    
	    
	    Ts.add("Clouds");
	    System.out.println(Ts);
	
	    HM.put("data1",1234);
	    System.out.println(HM.get("data1"));
	
	
	}
	
	

}
