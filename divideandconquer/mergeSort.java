public class mergeSort {

    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int arr[], int si, int ei){

        if(si >= ei){
            return;
        }

        int mid = si + (ei - si) / 2;
        sort(arr,si,mid); // left part sort
        sort(arr,mid+1,ei); //right part sort
        merge(arr,si,mid,ei);

    }

    public static void merge(int arr[], int si, int mid, int ei){

        int temp[] = new int[ei-si+1];
        int i = si; //left part
        int j = mid+1; //right part
        int k = 0; //temp arr
    

        while( i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; 
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //For Sort the remaing part

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while( j <= ei){
            temp[k++] = arr[j++];
        }

        //Copy all the sorted part in array

        for(k=0,i=si; k < temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,2,5,1,8,9};
        sort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
