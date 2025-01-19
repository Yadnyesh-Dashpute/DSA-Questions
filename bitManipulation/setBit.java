public class setBit {

    public static int stBit(int n, int i){

        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static void main(String[] args) {
        System.out.println(stBit(10, 2));
    }
}
