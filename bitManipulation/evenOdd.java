public class evenOdd{

    public static void fun(int num){
        int bitMask = 1;
        if((num & bitMask)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        fun(5);
        fun(6);
    }
}