public class BubbleSort {
    public void bSort(int []A){
        for(int i=0; i<A.length; i++){
            int flag = 0;
            for(int j=0; j<A.length-1-i; j++){

                if(A[j]>A[j+1]){
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;

                    flag=1;
                }
            }
            if(flag==0) break;
        }
    }
}
