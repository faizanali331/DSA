public class BinarySearch {
    public int bSearch(int []A, int element, int i, int j){
        if(i==j) {
            if (element == A[i]) {
                return i;
            } else return -1;
        }
        else{
            int mid = (i+j)/2;

            if(element==A[mid])
                return mid;

            else if(element>A[mid])
                return bSearch(A, element, mid+1, j);

            else
                return bSearch(A, element, i, mid-1);
        }

    }
}
