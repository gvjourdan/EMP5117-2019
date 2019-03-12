public class SetDicePlayer {
	
	private int numberOfDice = 2;
	
	private Die[] diceArray;
	private int[] results;
	
	public SetDicePlayer(){
		this(2);
	}

	public SetDicePlayer(int numberOfDice){
		this.numberOfDice = numberOfDice;
		diceArray = new Die[numberOfDice];

		// Creating the actual instances of Die
		for(int i=0; i<diceArray.length; i++){
			diceArray[i]= new Die();
		}

		results = new int[numberOfDice*Die.MAXVALUE - numberOfDice + 1];

	}
	
	private int playSet(){
		int result = 0;
		for(int i=0; i<diceArray.length; i++){
			diceArray[i].roll();
			result += diceArray[i].getCurrentValue();
		}
		return (result);		
	}

	private void runExperiment(int numberOfRuns){

		// initialisation of the array. In the current implementation, since
		// "runExperiment" is called only once, this step isn't necessary 
		// (0 being the default value). If we could run several experiments
		// however, we would have to reset the arraw between each experiment
		for(int i=0; i < results.length;i++){
			results[i]=0;
		}
		for(int i = 0; i < numberOfRuns; i++){
			results[playSet()- numberOfDice]++;
		}

		System.out.print("\n Results: ");
		System.out.println(java.util.Arrays.toString (results));
	}

	public static void main(String[] args){

		SetDicePlayer player;

		 
		// for now, we will just trust the input. If an input is provided, that's the number of 
		// experiments to run. If not, we just use a preset value (500000 here)
		if(args.length == 1){
			player = new SetDicePlayer(Integer.parseInt(args[0]));
			player.runExperiment(500000);
		} else if(args.length == 2){
			player = new SetDicePlayer(Integer.parseInt(args[0]));
			player.runExperiment(Integer.parseInt(args[1]));
		} else {
			player = new SetDicePlayer();
			player.runExperiment(500000);
		}
	}
}
