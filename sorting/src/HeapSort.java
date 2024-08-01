public class HeapSort {
    public void swap(int []a, int x, int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    public void maxHeapify(int []a, int n, int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if (l<n&&a[l]>a[largest]) {
            largest = l;
        }
        if(r<n&&a[r]>a[largest]){
            largest = r;
        }
        if(largest!=i){
            swap(a, largest, i);
            maxHeapify(a, n, largest);
        }
    }
    public void hSort(int []a, int n){

        for(int i=n/2-1; i>=0; i--){
            maxHeapify(a, n, i);
        }
        for(int i=n-1; i>0; i--){
            swap(a, i, 0);
            maxHeapify(a, i, 0);
        }

    }
}

