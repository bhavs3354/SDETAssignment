package testprograms;

import java.util.HashSet;
import java.util.Set;

public class elementsofhashsettoArray {
	public static void main(String[] args) {

		 Set<Integer> set = new HashSet<Integer>();
		 Object[] arr = new Object[set.size()];
		 int j =0;
		 for(int i : set) {
		 arr[j] =i;
		 j++;
		 }
		 for(Object i: arr) {
		 System.out.println(i);
		 }
	}	 

}
