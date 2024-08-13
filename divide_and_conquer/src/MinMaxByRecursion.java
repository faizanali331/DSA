public class MinMaxByRecursion {
    static class SetMinMax{
        int min;
        int max;
    }
    public SetMinMax findMinMax(int []A, int i, int j){

        SetMinMax st = new SetMinMax();
        if(i==j){
            st.min=A[i];
            st.max=A[i];
            return st;

        }else if(i+1==j){
            if(A[i]<A[j]){
                st.min=A[i];
                st.max=A[j];
                return st;

            }else {
                st.min=A[j];
                st.max=A[i];
                return st;
            }
        }else {
            SetMinMax left =findMinMax(A, i, (i+j)/2);
            SetMinMax right=findMinMax(A, (i+j)/2+1, j);

            st.min = Math.min(left.min, right.min);
            st.max = Math.max(left.max, right.max);

            return st;
        }
    }
}
