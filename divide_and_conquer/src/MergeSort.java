public class MergeSort {

    public void merge(int left, int mid, int right,  int []A){

        int l = mid+1-left;
        int r = right-mid;

        int []L = new int[l];
        int []R = new int[r];

        for(int i=0; i<l; i++){
            L[i]=A[i+left];
        }
        for(int i=0; i<r; i++){
            R[i]=A[i+mid+1];
        }

        int a=0, b=0, k=left;
        while(a<l&&b<r){
            if(L[a]<R[b]){
                A[k]=L[a];
                a++;
            }else{
                A[k]=R[b];
                b++;
            }
            k++;
        }
        while(a<l){
            A[k]=L[a];
            a++;
            k++;
        }
        while(b<r){
            A[k]=R[b];
            b++;
            k++;
        }

    }
    public void sort(int left, int right, int []A){
        if(left<right) {
            int mid = (left+right)/2;
            sort(left, mid, A);
            sort(mid+1, right, A);

            merge(left, mid, right, A);
        }
    }
}
