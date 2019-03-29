public class TestSplitSentences{

	public static void main(String[] args){

		System.out.println("\nTesting \"splitSentences\"\n");

		String test = "One. Two. Another one .. This, also. With 1,#.just.more.";
		System.out.println("The string \"" + test 
			+ "\" is plit into:");
		String[] set = StringUtils.splitSentences(test);
		for(int i = 0; i < set.length; i++){
			System.out.println("\"" + set[i] + "\""); 
		}
	}		
}