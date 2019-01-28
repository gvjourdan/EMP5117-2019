
public class SieveOfEratosthenes {


    private static void sieveOfEratosthenes(int bound){

        boolean[] sieve = new boolean[bound+1];
        
        //initialize to true
        for(int i =1; i < sieve.length; i++){
            sieve[i] = true;
        }

        //look for non-prime numbers
        for(int i =2; i < sieve.length; i++){
            if(sieve[i]) {
                int j = 2*i;
                while(j < sieve.length){
                    sieve[j] = false;
                    j+=i;
                }
            } 
        }

        //print results
        System.out.print("The prime numbers up to " + bound + " are: ");
        for(int i =1; i < sieve.length; i++){
            if(sieve[i]) {
                if(i > 1) {
                    System.out.print(", " + i);
                } else {
                    System.out.print(i);
                }
            } 
        }

        System.out.println();

    }


    public static void main(String[] args) { 
        
        int n = Integer.parseInt(args[0]);
        sieveOfEratosthenes(n);
  }
}


