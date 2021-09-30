package testprograms;

public class convertstringtoarray {
	
	public static void main(String[] args) {
		char[] arr = {'a','b','c'};

		System.out.println("char array to string is "+ String.valueOf(arr));

		String s = "abc";
		System.out.println("string to array");

		for(char ch: s.toCharArray()) {
		System.out.print(ch +" ");
		}
		}


}
