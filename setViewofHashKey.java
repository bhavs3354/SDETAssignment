package testprograms;

import java.util.Enumeration;
import java.util.Hashtable;

public class setViewofHashKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> ht = new Hashtable<String, String>();
	      ht.put("1", "One");
	      ht.put("2", "Two");
	      ht.put("3", "Three");
	      Enumeration<String> e = ht.keys();
	      
	      while (e.hasMoreElements()) {
	         System.out.println(e.nextElement());
	      }


	}

}
