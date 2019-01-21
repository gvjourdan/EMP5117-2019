import java.util.Scanner ;

public class InputScanner {
	public static void main(String[] args){
		Scanner sc;
		int age;
		String answer;
		sc = new Scanner(System.in);
		System.out.print("How old are you? ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("What is your favourite colour? ");
		answer = sc.nextLine();
		System.out.print("You are " + age + " years old. ");
		System.out.println("You like the colour " + answer);

	}
}
