public class DiceSorter { 
 
 	private Die[] dice;

 	public DiceSorter(int numberOfDice){
 		dice = new Die[numberOfDice];
 		for(int i = 0 ; i < numberOfDice ; i++) {
 			dice[i] = new Die();
 		}
 	}

 	public void rollAndSort(){
 		for(int i = 0 ; i < dice.length ; i++) {
 			dice[i].roll();
 		}
 		System.out.println("Before Sorting:");
 		System.out.println(java.util.Arrays.toString (dice));
 		sort(dice);
 		System.out.println("After Sorting:");
 		System.out.println(java.util.Arrays.toString (dice));
	}

	public static void sort(Die[] xs){ 
 
		int i, j, min; 
 
		for (i = 0; i < xs.length - 1; i++) { 
			min = i; 
			for (j = i + 1; j < xs.length; j++) { 
				if (xs[j].compareTo(xs[min]) < 0) {
					min = j; 
				} 
			} 
 
			Die tmp = xs[min]; 
			xs[min] = xs[i]; 
			xs[i] = tmp; 
	  	} 
	} 

	public static void main(String[] args) { 
 
		DiceSorter sorter = new DiceSorter(10);
		sorter.rollAndSort();
		sorter.rollAndSort();
		sorter.rollAndSort();
		sorter.rollAndSort();
		sorter.rollAndSort();
	} 
 
}