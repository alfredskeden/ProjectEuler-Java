
package projecteuler.java;

public class Problem_2 {
    
    public Problem_2 (){
        int sum = 0;
        int before = 1;
        int before1 = before;
        for (int i = 1; i < 4000000; i=i){
            if(i%2==0){
                sum +=i;
            }
            
            before1 = i;
            i+=before;
            before = before1;
            
        }
        System.out.println(sum);
    }
}
