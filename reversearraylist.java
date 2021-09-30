package testprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reversearraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arraylist = new ArrayList<Integer>();
		 
		 for(int i =1;i<=10;i++) {
		 arraylist.add(i);
		 }
		 
		 Collections.reverse(arraylist);
		 
		 for(int i: arraylist) {
		 System.out.println(i);
		 }


	}

}
