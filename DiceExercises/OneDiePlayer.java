public class OneDiePlayer {
	
	private Die die;

	private int[] results = new int[6];

	public OneDiePlayer(){
		die = new Die();
	}

	private int play(){
		die.roll();
		return(die.getCurrentValue());
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
			results[play()-1]++;
		}

		System.out.print("\n Results: ");
		System.out.println(java.util.Arrays.toString (results));
	}

	public static void main(String[] args){

		OneDiePlayer player = new OneDiePlayer();
//		for(int i = 0; i < 10 ; i++) {
//			System.out.println("Die is " + player.play());
//		}
		// for now, we will just trust the input. If an input is provided, that's the number of 
		// experiments to run. If not, we just use a preset value (500000 here)
		if(args.length == 1){
			player.runExperiment(Integer.parseInt(args[0]));
		} else{
			player.runExperiment(500000);
		}
	}
}
