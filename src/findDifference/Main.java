package findDifference;

public class Main {
	public static void main(String[] args) {
		String s = "abcd";
		
		String t = "bcda";
		
		System.out.println("Input S:" + s);
		
		System.out.println("Input T:" + t);
		
		FindTheDifferenceOfTwoStringFunction solution = new FindTheDifferenceOfTwoStringFunction();
		
		System.out.println("Solution: " + solution.findTheDifference(s, t));
	}
}
