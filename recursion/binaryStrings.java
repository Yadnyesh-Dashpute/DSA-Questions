public class binaryStrings {
    
    public static void printBinary(int n, String str, int lastPlace){

        if(n == 0){
            System.out.println(str);
            return;
        }

        printBinary(n-1, str+"0", 0);

        if(lastPlace == 0){
            printBinary(n-1, str+"1", 1);
        }
    }
    
    public static void main(String[] args) {
        printBinary(3, "", 0);
    }
}
