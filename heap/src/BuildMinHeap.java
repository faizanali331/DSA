public class BuildMinHeap {
    public static void swap(int[] a, int min, int i){
        int temp = a[min];
        a[min]=a[i];
        a[i]=temp;
    }
    public static void heapify(int[] a, int n, int i){
        int min = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && a[left]<a[min]){
            min = left;
        }
        if(right<n && a[right]<a[min]){
            min = right;
        }
        if(min!=i){
            swap(a, min, i);
            heapify(a, n, min);
        }
    }
    public static void buildHeap(int[] a){
        int n=a.length;
        for(int i=n/2-1; i>=0; i--){
            heapify(a, n, i);
        }
    }

}
