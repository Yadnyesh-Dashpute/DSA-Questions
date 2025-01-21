public class TilingRectangle {
    
    public static int noWays(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        int horizontal = noWays(n-1);
        int vertical = noWays(n-2);

        return  horizontal + vertical;
    }

    public static void main(String[] args) {
        System.out.println(noWays(4));
    }
}
