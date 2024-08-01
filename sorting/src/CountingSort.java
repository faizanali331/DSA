public class CountingSort {
    public void Sort(int []A, int range){
        int []arr = new int[range+1];

        for(int i=0; i<A.length; i++){
            arr[A[i]]++;
        }

        for(int i=1; i<arr.length; i++){
            arr[i]=arr[i-1]+arr[i];
        }

        int []B = new int[A.length];

        for(int i=A.length-1; i>=0; i--){
            int index = A[i];
            B[arr[index]-1]=A[i];
            arr[index]--;
        }
        for(int i=0; i<A.length; i++){
            A[i]=B[i];
        }
    }
}
