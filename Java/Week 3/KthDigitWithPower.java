// Finds the power of A power B and then finds the kth digit of the number
class KthDigitWithPower {
    public static void main(String[] args) {
       int A = 3, B=3, k=1;
      // Built-in pow function to find A power B
       long power=(long)Math.pow(A,B);
        long i=1;
        
        while(power>0){
            long ans=power%10;
          // 
            if(k==i){
                return ans;
            }
            i++;
            power=power/10;
        }
        return 0;
       
    }
}



// In online compilers use the below code

class Main {
    public static void main(String[] args) {
       int A = 3, B=3, k=1;
       long power=(long)Math.pow(A,B);
        long i=1;
        
        while(power>0){
            long ans=power%10;
            if(k==i){
                System.out.println(ans);
                break;
            }
            i++;
            power=power/10;
        }
        
       
    }
}

(or)

<Alternate solution>

import java.util.Scanner;

public class Kthdigitofanumber {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int k = in.nextInt();
        long p = (long)Math.pow(A,B);
        for(int i = 1; i < k; i++){
            p = p/10;
        }
        System.out.println(p%10);
    }
}
