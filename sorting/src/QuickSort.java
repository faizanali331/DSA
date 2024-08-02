public class QuickSort {
    public void swap(int a, int b, int[] A){
        int temp = A[a];
        A[a]=A[b];
        A[b]=temp;
    }
    public int partician(int lb, int ub, int[] A){
        int start = lb;
        int end = ub;
        int pivot = A[lb];

        while(start<end){
            while(A[start]<=pivot && start<end){
                start++;
            }
            while(A[end]>=pivot && start<end){
                end--;
            }
            if(end>start){
                swap(start, end, A);
            }
        }
        swap(lb, end, A);
        return end;
    }
    public void qSort(int lb, int ub, int []A){
        if(lb<ub) {
            int loc = partician(lb, ub, A);
            qSort(lb, loc - 1, A);
            qSort(loc + 1, ub, A);
        }
    }
}
