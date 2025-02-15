
import java.util.*;

public class multiDimensionalArrayList {
    public static void main(String[] args) {
        

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(4);

        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(7);

        mainList.add(list3);
        
        list.remove(1);
        list.remove(0);

        for(int i = 0 ;  i < mainList.size(); i++){
            
            ArrayList<Integer> currList = mainList.get(i);

            for(int j = 0 ; j < currList.size(); j++){
                    System.out.print(currList.get(j)+" ");
                
            }
            System.out.println();

        }
    }
}
