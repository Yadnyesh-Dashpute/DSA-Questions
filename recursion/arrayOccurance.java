public class arrayOccurance {

    public static int firstOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }

        return  firstOccurance(arr, key, i+1);
    }

    public static int lastOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int lastFound = lastOccurance(arr, key, i+1);

        if(arr[i] == key && lastFound == -1){
            return  i;
        }

        return  lastFound;
    }


    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5,9,5,9,5,8,5};
        System.out.println(lastOccurance(arr, 5, 0)); 
    }
    
}

