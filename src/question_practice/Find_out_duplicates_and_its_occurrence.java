package question_practice;

import java.util.HashMap;
import java.util.Map;

public class Find_out_duplicates_and_its_occurrence {

	static String sentence = "Hi my name name is vikas chauhan is is chauhan chauhan is";

	static Map<String, Integer> m = new HashMap<String, Integer>();

	public static void main(String[] args) {

		String[] text = sentence.split(" ");
		for (String data : text) {

			if(m.get(data)!=null) {
				m.put(data, m.get(data)+1);
			}else {
				m.put(data, 1);
			}

		}
		System.out.println("It print keys and values both = " + m);
		System.out.println("It print only keys = " + m.keySet());
		System.out.println("It print values = "+ m.get("chauhan"));

		
		System.out.println("************************OUT_PUT*****************************");
		for (String key : m.keySet()) {
			
			if(m.get(key)>1) {
				System.out.println(key + " occurrence is "+m.get(key) );
			}
		}
		
		System.out.println("************************OUT_PUT*****************************");

	}
}
