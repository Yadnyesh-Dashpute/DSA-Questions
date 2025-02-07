public class findSubsets {
    
    public static void subSet(String str, String ans, int i){
        //Base Case

        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }else{
            System.out.println(ans);
        }
            return;
        }
        //Recursion 

        //Yes Choice

        subSet(str, ans+str.charAt(i), i+1);

        subSet(str, ans, i+1);
    }
    
    public static void main(String[] args) {
        String str = "abc";
        subSet(str,"",0);
    }
}
