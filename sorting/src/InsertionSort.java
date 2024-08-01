public class InsertionSort {
    public void iSort(int []A){
        for(int i=1; i<A.length; i++){
            int j=i-1;
            int temp = A[i];

            while(j>=0&&A[j]>temp){
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=temp;

        }
    }
}
