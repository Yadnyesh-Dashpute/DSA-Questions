class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder sb = new StringBuilder("");

        int A = word1.length();
        int B = word2.length();
        int a = 0;
        int b = 0;
        int word = 1;

        while ( a < A && b < B){
            if(word == 1){
                sb.append(word1.charAt(a));
                a++;
                word = 2;
            }
            else{
                sb.append(word2.charAt(b));
                b++;
                word = 1;
            }

        }

        while ( a < A){
            sb.append(word1.charAt(a));
            a++;
        }

        while ( b < B){
            sb.append(word2.charAt(b));
            b++;
        }

        return sb.toString();
    }
}
