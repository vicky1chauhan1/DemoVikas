package question_practice;

import java.util.HashMap;
import java.util.Map;

public class ABC {

	public void demo() {
		Map<String, Integer> mp = new HashMap<String, Integer>();
		String string = "hi bb hi sdf sdf jwe hwj huh huh end end end end end end";
		String[] split = string.split(" ");

		for (String data : split) {

			if (mp.get(data) != null) {
				mp.put(data, mp.get(data) + 1);
			} else {
				mp.put(data, 1);
			}
		}	
			System.out.println(mp);
			for( String key : mp.keySet()) {
				
				if(mp.get(key) > 1) {
					System.out.println(key + " occurrence is "+mp.get(key));
				}
			}

		
		
		

	}

	public static void main(String[] args) {
     new ABC().demo();
	}

}
