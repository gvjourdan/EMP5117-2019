public class StringUtils{

	public static String upperCase(String string){

		return string.toUpperCase();

	}

	public static String withoutSpecials(String string){

		return string.replaceAll("[^a-zA-Z0-9]", "");
	}

	public static int numberOfWords(String string){

		String trimmed  = string.trim();
		if(trimmed.length() == 0){
			return 0;
		}
		String [] words = trimmed.split("\\s+");

		return words.length;
	}

	public static String reverse(String string){

		String backwards = "";

		for(int i = string.length() - 1; i>=0; i--){
			backwards = backwards + string.charAt(i);
		}

		return backwards;
	}

	public static String[] splitSentences(String string){

		return string.split("\\.");
	}

}