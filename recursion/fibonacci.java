public class fibonacci {
    
    public static int fib(int n){
        if(n == 1 || n == 0){
            return n;
        }
        int fibN = fib(n-1);
        int fibN2 = fib(n-2);
        int fibC = fibN + fibN2;
        return  fibC;

    }
    public static void main(String[] args) {
        System.out.println(fib(25));
    }
}
