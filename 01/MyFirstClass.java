
public class MyFirstClass {

	/* This is my method */
	public static void myMethod(){
		System.out.println("Hey, look!");
	}
	public static void main(String[] args){

		int myInt = 0;
		long myLong;

		boolean myBool = false;
		char myChar = 'c';

		myLong = 3L;

		System.out.println(myInt + "yo");
		System.out.println("yes!");
	
		System.out.println("myInt: " + myInt + 
			" myLong: " + myLong + " myChar:" + 
			myChar + " myBool: " + myBool);
		
		String s = "this is a string";
		String s2 = "this is another string.";
		String s3 = s+s2;
		s=s.concat(". ");
		String s4 = s2.substring(8,15);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("s contains \"string\": " + s.contains("string") );
		System.out.println("s contains \"strong\": " + s.contains("strong") );

		myMethod(); // calling myMethod

		MyOtherClass myOtherClassReference;
		myOtherClassReference = new MyOtherClass();
		System.out.println(myOtherClassReference.myOtherClassMethod(12));
		myOtherClassReference.methodForLoop();
		myOtherClassReference.methodWhileLoop();
		myOtherClassReference.methodIf(true);
		myOtherClassReference.methodIf(false);

	}	
}
