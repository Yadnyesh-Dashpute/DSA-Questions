class Solution {
    public String capitalizeTitle(String title) {
        int count = 0;
        StringBuilder sb = new StringBuilder("");
        String[] words = title.toLowerCase().split(" ");
        
        for(String word: words){

            if(word.length() > 2){
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            } else{
                sb.append(word);
            }
            sb.append(" ");
        }
         return sb.toString().trim();

        }
    }
