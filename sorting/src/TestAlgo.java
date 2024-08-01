public class TestAlgo {
    public static void main(String[] args) {
        int []A = {3, 53, 2, 93, 1, 83, 53, 29, 47, 10, 6, 24};
        /*BubbleSort b = new BubbleSort();
        b.bSort(A);
        for(Integer x: A)
            System.out.println(x);

        InsertionSort i = new InsertionSort();
        i.iSort(A);
        for(Integer x:A)
            System.out.println(x);

        SelectionSort s = new SelectionSort();
        s.sSort(A);
        for(Integer x: A)
            System.out.println(x);

        HeapSort h = new HeapSort();
        h.hSort(A, A.length);
        for(Integer x: A)
            System.out.println(x);


        CountingSort cs = new CountingSort();
        cs.Sort(A, 93);
        for(Integer x: A)
            System.out.println(x);*/

        RadixSort rs = new RadixSort();
        rs.rSort(A);
        for(Integer x: A)
            System.out.print(x+" ");

    }
}
