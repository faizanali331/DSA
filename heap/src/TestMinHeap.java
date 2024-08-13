public class TestMinHeap {
    public static void main(String[] args) {
        BuildMinHeap bh = new BuildMinHeap();

        int a[]={3, 73, 35, 94, 4, 8, 44};
        bh.buildHeap(a);
        for(Integer x: a)
            System.out.print(x+" ");

        InsertionMinHeap ip = new InsertionMinHeap();
        int[] b = ip.insert(a, 40);
        System.out.println("");
        for(Integer x: b)
            System.out.print(x+" ");

        DeleteMinHeap dh = new DeleteMinHeap();
        int[] c = dh.delete(b);
        System.out.println("");
        for(Integer x: c)
            System.out.print(x+" ");

    }
}
