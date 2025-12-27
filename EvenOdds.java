import java.util.*;

public class EvenOdds{
    public static void main(String[] args) {
        
        Scanner gg = new Scanner(System.in);
        long n = gg.nextLong();
        long k = gg.nextLong();

        gg.close();

        // int ans[] = new int[n];
        // int x = 0;
        
        // for(int i = 1; i<=n; i+=2){
        //     ans[x++] = i;
        // }
        // for(int i = 2; i<=n; i+=2){
        //     ans[x++] = i;
        // }
        // System.out.println(Arrays.toString(ans));
        // System.out.println(ans[k-1]);

        long odd = (n+1)/2;

        if(k <= odd){
            System.out.println(2 * k-1);
        }else{
            System.out.println(2*(k-odd));
        }
    }
}