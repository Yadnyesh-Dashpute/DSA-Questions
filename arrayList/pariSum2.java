
import java.util.ArrayList;

public class pariSum2 {
    public static void main(String[] args) {
        


        ArrayList<Integer> list = new ArrayList<>();


        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 18;
        int bp = -1;
        int n = list.size();
        boolean ans = false;

        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int rp = bp;
        int lp = bp+1;


        while (lp != rp){

            // Case 1

            if(list.get(lp) + list.get(rp) == target){
                ans = true;
            }

            // Case 2

            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % n;
            }
            else{
                rp = (n+rp-1) % n;
            }
        }

        System.out.println(ans);
    }
}
