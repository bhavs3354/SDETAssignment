package testprograms;

import java.util.HashMap;
import java.util.Map;

public class duplicateHashMpas {
	
	public static void main(String[] args) {
		 
		 char[] arr = {'a','b','c','c','d','a'};
		 
		 Map<Character, Integer> map = new HashMap<Character, Integer>();
		 
		 for(char ch : arr) {
		map.put(ch, map.getOrDefault(ch, 0)+1 );
		 }
		 
		 for( char ch : map.keySet()) {
		 if (map.get(ch) >1) {
		 System.out.println(ch);
		 }
		 }
		 
	}


}
