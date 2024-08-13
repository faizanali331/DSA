public class DeleteMinHeap {
    public static void createHeap(int[] c, int i){
        int min = i;
        int n = c.length;
        int l = 2*min+1;
        int r = 2*min+2;

        if(l<n && c[l]<c[min]){
            min = l;
        }
        if(r<n && c[r]<c[min]){
            min = r;
        }
        if(min!=i){
            int temp = c[min];
            c[min] = c[i];
            c[i] = temp;
            createHeap(c, min);
        }
    }
    public static int[] delete(int[] a){
        int c[] = new int[a.length-1];
        int temp = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = temp;

        for(int i=0; i<c.length; i++){
            c[i]=a[i];
        }
        createHeap(c, 0);
        return c;
    }
}
