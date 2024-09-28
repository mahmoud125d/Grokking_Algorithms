public class BinarySearch {
    public static int search(int[] arr ,int target){
    int mid,low,high;
        low = 0;
        high = arr.length-1;
        while(low<=high){
            mid=(low+high)/2;
            //mid = low + (high - low) / 2;  // Avoid potential overflow with (left + right) / 2
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
