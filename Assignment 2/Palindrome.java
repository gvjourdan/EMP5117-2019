public class Palindrome{


	private static boolean isPalindrome( String string ) {

 		String without = StringUtils.withoutSpecials(string);

 		String upped = StringUtils.upperCase(without);

 	    return upped.equals(StringUtils.reverse(upped));
	}

	public static void palindromes( String string ) {
		System.out.println("\nStarting palindromes\n");
		String[] set = StringUtils.splitSentences(string);
		for(int i = 0; i < set.length; i++){
			if(isPalindrome(set[i])) {
				System.out.println("\""+ set[i] + "\" is a palindrome.\n");
			} else {
				System.out.println("\""+ set[i] + "\" is not a palindrome.\n");
			}
		}

	}

	public static void main ( String [ ] args ) {

		String input = "a. 0110. madam . Call it a day. nURSes, RUN!!!."
		 + " A man, a plan, a canal, Panama. Was it a car or a cat "
		 + " I saw. No 'x' in Nixon. Break a leg.  Was it Eliot's "
		 + "toilet I saw?";

		palindromes(input);

	}
}