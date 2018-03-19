package projecteuler.java;

public class Problem_1 {
    
    public Problem_1(int sum1, int sum2){
        int sum = 0;
        for (int i = 0; i< 1000; i++){
            if(i%5 == 0){
                sum += i;
            }
            else if(i%3 == 0){
                sum += i;
            }
        }
        
        System.out.println(sum);
    }
}
