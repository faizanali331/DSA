public class LinearSearch {
    public int lSearch(int []A, int element){
        for(int i=0; i<A.length; i++){
            if(A[i]==element)
                return i;
        }
        return -1;
    }
}
