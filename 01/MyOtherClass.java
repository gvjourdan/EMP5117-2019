
public class MyOtherClass {
	
	public int myOtherClassMethod(int parameter){
		return (parameter + 1);
	}

	public void methodForLoop(){

		for(int i=0; i < 10; i++){
			System.out.println("Iteration : " + (i+1));
		}
		
	}

	public void methodWhileLoop(){
		int i = 0;

		while(i<10){
			System.out.println("Iteration : " + (i+1));
			i++;
		}
	}

	public void methodIf(boolean formalParameter){

		if(formalParameter){
			System.out.println("I went through the \"if\" clause");
		} else{
			System.out.println("I went through the \"else\" clause");		
		}
	}
}
