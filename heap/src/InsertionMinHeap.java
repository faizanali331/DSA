import java.util.Arrays;

public class InsertionMinHeap {
    public static int[] insert(int[] a, int x){
        int [] b = Arrays.copyOf(a, a.length+1);
        b[b.length-1] = x;
        int current = b.length-1;
        int parent = (current-1)/2;
        while(current>0){
            if(b[parent]>b[current]){
                int temp = b[parent];
                b[parent] = b[current];
                b[current] = temp;

                current = parent;
                parent = (parent-1)/2;
            }else break;
        }
        return  b;
    }

}
