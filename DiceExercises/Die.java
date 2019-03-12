
import java.util.Random;

public class Die {
	
	public static final int MAXVALUE = 6;
	private int currentValue;
	private Random generator= new Random();

	public Die(){
		roll();
	}

	public int getCurrentValue(){
		return currentValue;
	}
	
	public void roll(){
		currentValue = generator.nextInt(MAXVALUE)+1;
	}

	public int compareTo(Die other){
		if(getCurrentValue() < other.getCurrentValue()){
			return -1;
		} else if (getCurrentValue() == other.getCurrentValue()){
			return 0;
		} else {
			return 1;
		}
	}

	public String toString(){
		return "" + getCurrentValue();
	}
	public static void main(String[] args){
		Die die;
		die = new Die();
		System.out.println("Inital value: " + die.getCurrentValue());
		for(int i = 0 ; i < 10; i++) {
			die.roll();
			System.out.println("Next value: " + die.getCurrentValue());
		}
	}
}
