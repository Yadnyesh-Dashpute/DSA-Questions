import java.util.ArrayList;

public class containerWaterOptimized {
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


        int lp = 0;
        int rp = height.size() - 1;
        int maxWater = 0;
        while(lp < rp){

            int h = Math.min(height.get(lp), height.get(rp));
            int w = rp - lp;

            int waterArea = h * w;
            
            maxWater = Math.max(waterArea, maxWater);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

        System.out.println("Area of Water:"+maxWater);

    }
}
