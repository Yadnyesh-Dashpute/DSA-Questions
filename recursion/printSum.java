public class printSum {

    public static int sumN(int n){
        int sum;
        if(n == 1){
            return 1;
        }

        int sumn = sumN(n-1);
        sum = n + sumn;
        return  sum;

    }

    public static void main(String[] args) {
        System.out.println(sumN(5));
    }

}
