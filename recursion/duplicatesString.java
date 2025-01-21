public class duplicatesString {
    
    public static void remove(String str, StringBuilder newStr, boolean[] arr,int i){

        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);

        if(arr[currChar-'a'] == true){
            remove(str, newStr, arr, i+1);
        }else{
            arr[currChar-'a'] = true;
            remove(str, newStr.append(currChar), arr, i+1);
        }

    }


    public static void main(String[] args) {
        remove("apnacollege",new StringBuilder("") , new boolean[26], 0);
    }

}
