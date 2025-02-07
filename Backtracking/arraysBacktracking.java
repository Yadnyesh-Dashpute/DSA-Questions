public class arraysBacktracking {

    
    public static void arrBacktrack(int arr[], int i, int val){

        // Base Condition

        if(i == arr.length){
            printArr(arr);
            return;
        }

        arr[i] = val;
        arrBacktrack(arr, i+1, val+1);

        // Backtracking
        arr[i] = arr[i] - 2;


    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        arrBacktrack(arr, 0, 1);
        System.out.println();
        printArr(arr);
    }
}
