public class MyArrays{
	
	public static void main(String[] args){
		int[] xs;
		xs = new int[12];
		xs[0] = 10;
		for(int i = 0; i < xs.length; i++){
			xs[i]=i*i;
		}
		for(int i = 0; i < xs.length; i++){
			System.out.println(xs[i]);
		}
		double[][] d;
		d = new double[5][7];
	}
}