import java.util.*;

public class BeautifulYear{
    public static void main(String[] args) {
        
        Scanner gg = new Scanner(System.in);
        
        int y = gg.nextInt();
        int res = 0;

        Map<Integer,Integer> kk = new HashMap<>();
        if(y >= 1000 && y <= 9000){
            int x = y;
            while(x > 0){ 
                int dig = x % 10; 
                kk.put(dig, kk.getOrDefault(dig,0)+1);
                x = x/10;
            }
            boolean allUnique = true;
            for(int i : kk.values()){
                if(i != 1){
                     allUnique = false;
                     break;
                }
            }
            if(allUnique == true){
                res = y+1;
            }
        }
        System.out.println(res);

    }
}