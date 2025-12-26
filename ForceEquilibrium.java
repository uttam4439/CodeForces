import java.util.*;

public class ForceEquilibrium {

    public static void main(String[] args) {
        
        Scanner gg = new Scanner(System.in);
        int n = gg.nextInt();

        int X = 0;
        int Y = 0;
        int Z = 0;

        for(int i = 0; i<n; i++){
            X += gg.nextInt();
            Y += gg.nextInt();
            Z += gg.nextInt();
        }

        if((X == 0) && (Y == 0) && (Z == 0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}