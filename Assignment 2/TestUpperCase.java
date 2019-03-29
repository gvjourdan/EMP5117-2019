public class TestUpperCase{

	public static void main(String[] args){

		System.out.println("\nTesting \"upperCase\"\n");

		String test = "all lower case";
		System.out.println("The string \"" + test 
			+ "\" becomes \"" + StringUtils.upperCase(test) + "\"");		
		test = "This Is An Mixed";
		System.out.println("The string \"" + test 
			+ "\" becomes \"" + StringUtils.upperCase(test) + "\"");		
		test = "ALL UPPER CASE";
		System.out.println("The string \"" + test 
			+ "\" becomes \"" + StringUtils.upperCase(test) + "\"");		
		test = "With: Some ./,#2@4 characters";
		System.out.println("The string \"" + test 
			+ "\" becomes \"" + StringUtils.upperCase(test) + "\"");		
	}
}