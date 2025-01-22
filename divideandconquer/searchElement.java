public class searchElement {


    public static int search(int arr[], int tar, int si, int ei){

        int mid = si + (ei-si)/2;


        if(arr[mid] == tar){
            return mid;
        }

        //mid on L1

        if(arr[si] <= arr[mid]){
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si,mid - 1);
            }else{
                return search(arr, tar, mid+1, ei);
            }
        }
        else{

        //Mid on L2
        if(arr[mid] <= tar && tar <= arr[ei]){
            return search(arr, tar, mid+1, ei);
        }else{
            return search(arr, tar, si, mid-1);
        }
    }

}

    public static void main(String[] args) {
        int arr[] = {3,2,5,0,1,8,9};
        int tar = 0;
        int targetIdx = search(arr,tar,0,arr.length-1);
        System.out.println(targetIdx);
    }
}
