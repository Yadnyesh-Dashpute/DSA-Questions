public class getBit {

    public static void getBt(int n, int i){
        int bitMask = 1 << i;
        System.out.println(n&bitMask);
    }
    public static void main(String[] args) {
        
        getBt(10, 3);

    }
}
