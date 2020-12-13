package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Class2 {
	
	/**
	 * 
	 * Count occurrence
	 * 
	 * 
	 * @param list -> ArrayList contains each line to read
	 * @param map -> Object type Map<String, Integer>
	 * 
	 */
	
	static void calculOcc (List<String> list, Map<String, Integer> map) {
		for (String w : list) {
			Integer i = map.get(w);
			if ( i == null) {
				map.put(w, 1);
				
			} else {
				map.put(w, i+1);
			}
		}
		System.out.println("Analysis its ok");
	}

}
