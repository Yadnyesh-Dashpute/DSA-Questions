
import java.util.ArrayList;

public class containerMostWater {
    
    public static void main(String[] args) {
        

        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int maxValue = Integer.MIN_VALUE;

        for(int i =0; i < height.size();i++){

            for(int j=i+1; j < height.size(); j++){

                int h = Math.min(height.get(i),height.get(j));
                int w = j - i;
                int a = h * w;
                maxValue = Math.max(a, maxValue);
            }

        }
System.out.println("Area of Container Size:"+maxValue);
    }
}
