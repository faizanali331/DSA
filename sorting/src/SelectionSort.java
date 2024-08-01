public class SelectionSort {
    public void sSort(int []A){
        for(int i=0; i<A.length-1; i++){
            int min = i;
            int temp = A[i];
            for(int j=i+1; j<A.length; j++){

                if(A[min]>A[j]){
                    min = j;
                }
            }
            A[i]=A[min];
            A[min]=temp;
        }
    }
}
