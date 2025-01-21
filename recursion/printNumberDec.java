public class printNumberDec {
    
    public static void printDec(int n){

        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printDec(n-1);
        System.out.print(n+" ");
        // printDec(n-1);

    }
    
    public static void main(String[] args) {
        printDec(10);
    }
}
