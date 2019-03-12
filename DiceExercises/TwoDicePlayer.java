public class TwoDicePlayer {
	
	private Die die;
	private Die die2;

	private int[] results = new int[11];

	public TwoDicePlayer(){
		die = new Die();
		die2 = new Die();
	}

	
	private int playPair(){
		die.roll();
		die2.roll();
		return (die.getCurrentValue()+ die2.getCurrentValue());
		
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
			results[playPair()-2]++;
		}

		System.out.print("\n Results: ");
		System.out.println(java.util.Arrays.toString (results));
	}

	public static void main(String[] args){

		TwoDicePlayer player = new TwoDicePlayer();
		// for now, we will just trust the input. If an input is provided, that's the number of 
		// experiments to run. If not, we just use a preset value (500000 here)
		if(args.length == 1){
			player.runExperiment(Integer.parseInt(args[0]));
		} else{
			player.runExperiment(500000);
		}
	}
}
