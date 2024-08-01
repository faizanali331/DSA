public class RadixSort {

    public void countingSort(int[] A, int exp){
        int count[] = new int[10];
        int[] B = new int [A.length];

        for(int i=0; i<A.length; i++){
            int index=(A[i]/exp)%10;
            count[index]++;
        }
        for(int i=1; i<10; i++){
            count[i]=count[i-1]+count[i];
        }

        for(int i=A.length-1; i>=0; i--){
            int index = (A[i]/exp)%10;
            B[count[index]-1]=A[i];
            count[index]--;
        }
        for(int i=0; i<A.length; i++){
            A[i]=B[i];
        }

    }
    public void rSort(int[] A){
        int max = A[0];
        for(int i=1; i<A.length; i++){
            if(max<A[i]){
                max=A[i];
            }
        }

        for(int exp=1; max/exp>0; exp*=10){
            countingSort(A, exp);
        }
    }
}
