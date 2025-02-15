import java.util.ArrayList;

public class pairSumProblem {
    public static void main(String[] args) {
        
        
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        int lp = list.get(0);
        int rp = list.size()-1;
        int target = 50;
        boolean isTr = false;
        while (lp != rp){
            if(list.get(lp)+list.get(rp) == target) {
                isTr = true;
            }

            if(list.get(lp)+ list.get(rp) < target) {
                lp++;
            }else {
                rp--;
            }
        }

        System.out.println(isTr);

    }
}
