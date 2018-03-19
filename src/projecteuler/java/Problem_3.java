package projecteuler.java;

public class Problem_3 {

    public Problem_3(long largeNumer) {
        long largeNumer1 = largeNumer;
        int[] anArray;
        anArray = new int[100];
        int arrayIndex = 0;
        
        for (int y = 2; y < largeNumer; y++) {
            
            if(y==largeNumer1){
                return;
            }
            
            System.out.println(largeNumer1);
            
            if (isPrime(y)==true) {
                if (largeNumer1 % y == 0) {
                    System.out.println(largeNumer1);
                    largeNumer1 /= y;
                    anArray[arrayIndex] = y;
                    y=2;
                    arrayIndex++;
                }
            }
        }
        for (int element: anArray) {
         System.out.println(element + "\n");
      }
    }

    boolean isPrime(int n) {
        //check if n is a multiple of 2
        
        if (n % 2 == 0) {
            return false;
        }
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
