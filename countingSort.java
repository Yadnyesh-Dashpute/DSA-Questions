public class countingSort {
    
    public static void countingSrt(int arr[]) {
        
        int largest = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            largest = Math.max(largest, arr[i]);
        }

        int counter[] = new int[largest+1];

        for(int i = 0 ; i < arr.length; i++){
            counter[arr[i]]++;
        }
        int j = 0 ;
        for(int i = 0 ; i < counter.length; i++){
            while(counter[i] > 0){
                arr[j] = i;
                j++;
                counter[i]--;
        }
    }
}
        public static void printArr(int arr[]) {
            for(int i = 0 ; i<arr.length; i++) {
                System.out.print(" "+arr[i]);
            }
        }
    
    
    public static void main(String[] args) {
        int arr[] = {9,1,4,2,3};
        countingSrt(arr);
        printArr(arr);
    }    
}
