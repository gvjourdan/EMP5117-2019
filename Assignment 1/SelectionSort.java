public class SelectionSort { 
 
	public static void sort(int[] xs){ 
 
		int i, j, argMin, tmp; 
 
		for (i = 0; i < xs.length - 1; i++) { 
			argMin = i; 
			for (j = i + 1; j < xs.length; j++) { 
				if (xs[j] < xs[argMin]) { 
					argMin = j; 
				} 
			} 
 
			tmp = xs[argMin]; 
			xs[argMin] = xs[i]; 
			xs[i] = tmp; 
	  	} 
	} 

	public static void printArray(int[] array){
		
		System.out.print("[");
		for(int i = 0; i < array.length; i++){
			if(i>0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println("]");
	}

	public static void main(String[] args) { 
 
		int[] array; 
		array = new int[]{100,34,72,56,82,67,94}; 
 	
 		printArray(array);
		sort(array); 
 		printArray(array);
 
		array = new int[]{1,2,2,1,2,2,1,0}; 
 		printArray(array);
		sort(array); 
 		printArray(array);

		array = new int[]{1}; 
 		printArray(array);
		sort(array); 
 		printArray(array);

		array = new int[]{}; 
 		printArray(array);
		sort(array); 
 		printArray(array);

	} 
 
}