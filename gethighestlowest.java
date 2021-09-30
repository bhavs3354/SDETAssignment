package testprograms;

import java.util.Set;
import java.util.TreeSet;

public class gethighestlowest {
	
	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(2);
		ts.add(1);
		int i =0;

		for(int j : ts) {
		if(i ==0) {
		System.out.println("Lowest "+ j);
		}
		if(i == ts.size()-1) {
		System.out.println("highest "+j);
		}
		i++;
		}
		}


}
