public class Straight_Min_Max {
    static class MinMax{
        int min;
        int max;
    }
    public MinMax min_max (int []ar) {

        int min = ar[0];
        int max = ar[0];

        for (Integer x: ar) {
            if(x>max)
                max=x;

            if(x<min)
                min=x;

        }
        MinMax a = new MinMax();
        a.min=min;
        a.max=max;

        return a;
    }
}
