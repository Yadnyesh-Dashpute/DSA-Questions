import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
        

        ArrayList<Integer> list = new ArrayList<>();


        // Operations on ArrayList:

        // 1. Add Operation = Add element in ArrayList O(1)


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);


        // 2. get operation = To get Element at particular Index O(1)

        System.out.println(list.get(2));


        // 3. remove operation = To Remove element from list O(n)

        System.out.println(list.remove(2));


        // 4. setElement at Index = To set Element at particular index O(n)

        list.set(2, 10);
        System.out.println(list);


        // 5. Contains Element = To check whether the Element is present in Element O(n)

        System.out.println(list.contains(10)); // Return true if exists


        // 6. Add Operation = To Add Element at particular Index O(1)

        list.add(2,7);
        System.out.println(list);


        // 7. Size of An ArrayList = To Return the Size of ArrayList

        System.out.println(list.size());



        // 8. Print the ArrayList

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        
        System.out.println();
    }
}
