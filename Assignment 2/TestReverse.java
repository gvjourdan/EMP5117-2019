public class TestReverse{

	public static void main(String[] args){

		System.out.println("\nTesting \"reverse\"\n");

		String test = "This is some sentence.";
		System.out.println("The string \"" + test 
			+ "\" becomes \"" + StringUtils.reverse(test) + "\"");		
		test = "Words. Separated. By. Dots.";
		System.out.println("The string \"" + test 
			+ "\" becomes \"" + StringUtils.reverse(test) + "\"");		
		test = "With trailing spaces       ";
		System.out.println("The string \"" + test 
			+ "\" becomes \"" + StringUtils.reverse(test) + "\"");		
	}
}