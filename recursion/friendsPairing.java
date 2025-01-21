public class friendsPairing {
    
    public static int pairing(int n){
        if(n == 1 || n==2){
            return n;
        }

        // Single 

        int single = pairing(n-1);

        //pair

        int pair = pairing(n-2);
        int pairWays = single * pair;

        int totalWays = single + pairWays;

        return totalWays;
    }
    
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }
}
