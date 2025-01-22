

public class quickSort {

    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int arr[], int si, int ei){

        if(si >= ei){
            return;
        }

        int pIdx = partition(arr,si,ei);
        sort(arr,si,pIdx-1); //left
        sort(arr,pIdx+1,ei);
    }

    public static int partition(int arr[], int si, int ei){

        int pviot = arr[ei];

        int i = si-1;

        for(int j=si ; j < ei; j++){
            if(arr[j] < pviot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

                i++;
                int temp = pviot;
                arr[ei] = arr[i];
                arr[i] = temp;

                return  i;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,5,1,8,9};
        sort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
