public class clearLastBit {
    
    public static int lastBit(int n, int i){
        int bitMask = ((~0) << i);
        return (n & bitMask);

    }
    
    public static void main(String[] args) {
        System.out.println(lastBit(15,2 ));
    }    
}
