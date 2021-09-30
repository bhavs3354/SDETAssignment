package testprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class convertkeyofmaptolist {
	
	public static void main(String[] args) {

		 Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		 
		 List<Integer> arraylist = new ArrayList<Integer>();
		 
		 arraylist.addAll(map.keySet());
		 System.out.println("list is");
		 for(int i: arraylist) {
		 System.out.println(i);
		 }
		  
	 }


}
