public class TestNumberOfWords{

	public static void main(String[] args){

		System.out.println("\nTesting \"numberOfWords\"\n");

		String test = "This is some sentence.";
		System.out.println("The string \"" + test 
			+ "\" has " + StringUtils.numberOfWords(test) + " words");		
		test = "  With leading and trailing spaces  ";
		System.out.println("The string \"" + test 
			+ "\" has " + StringUtils.numberOfWords(test) + " words");		
		test = " With   odd     spacing.  ";
		System.out.println("The string \"" + test 
			+ "\" has " + StringUtils.numberOfWords(test) + " words");		
		test = "";
		System.out.println("The string \"" + test 
			+ "\" has " + StringUtils.numberOfWords(test) + " words");		
	}
}