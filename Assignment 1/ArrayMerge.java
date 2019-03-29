public class ArrayMerge{


	public static int[] mergeArray(int[] first, int[] second){
		int[] result;

		result = new int[first.length+second.length];
		int j;
		for(int i=0; i < first.length; i++){
			result[i]=first[i];
		}
		j = 0;
		for(int i=0; i < second.length; i++){
			result[first.length+i]=second[i];
		}
		return result;
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
	public static void main(String[] args){

		int[] firstArray;
		firstArray = new int[]{1,2,3};
		int[] secondArray;
		secondArray = new int[]{4,5,6,7};
		
		printArray(firstArray);
		printArray(secondArray);
		printArray(mergeArray(firstArray,secondArray));

		firstArray = new int[]{1};
		secondArray = new int[]{};

		printArray(firstArray);
		printArray(secondArray);
		printArray(mergeArray(firstArray,secondArray));

		firstArray = new int[]{};
		secondArray = new int[]{4};

		printArray(firstArray);
		printArray(secondArray);
		printArray(mergeArray(firstArray,secondArray));
	}

}
