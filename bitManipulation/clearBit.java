public class clearBit {
    
    public static int cleariBit(int n, int i){
        int bitMask = ~(1 << i);

        return  (n & bitMask);
    }
    
    public static void main(String[] args) {
       System.out.println( cleariBit(10, 1));
    }    
}
