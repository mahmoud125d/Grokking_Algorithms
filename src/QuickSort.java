public class QuickSort {
    public static int COUNTER = 0;
    public static void sort(int[] array,int start,int end){
        if(end<=start) return;
        int pivot =  partition(array,start,end);
        sort(array,start,pivot-1);
        sort(array,pivot+1,end);
    }
    private static int partition(int[] array,int start,int end){
        int pivot = array[end];
        int i=start-1;
        for(int j = start;j<end;j++){
            COUNTER++;
            if(array[j]<pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
