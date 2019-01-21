public class Stats{

	public static void main(String[] args){

		int[] myArray = new int[]{1,2,3,4,5,6,7,8,9,10};

		int sum = 0;		
		for(int i = 0; i < myArray.length; i++){
			sum = sum + myArray[i];
			// can also be written: sum += notes[i];
		}

		// the following does not work because "sum" and 
		// "myArray.length" are both integer, and the
		// division will be interpreted as an integer
		// division:
		System.out.println("Does not work: average= " + sum/myArray.length);

		// the following does work: we "cast" the result
		// as a primitive type "double":
		System.out.println("Does work: average= " + (double)sum/myArray.length);

	}


}