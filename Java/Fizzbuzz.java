import java.util.ArrayList;

public class Fizzbuzz {

	public static void main(String[] args) {
		 ArrayList<String> sol = new ArrayList<String>();
		 int n=18;
		 for (int i = 1; i <= n; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                sol.add("FizzBuzz");
	            } else if (i % 3 == 0) {
	                sol.add("Fizz");
	            } else if (i % 5 == 0) {
	                sol.add("Buzz");
	            } else {
	                sol.add(Integer.toString(i));
	            }
	        }
		 System.out.println(sol);
	}

}