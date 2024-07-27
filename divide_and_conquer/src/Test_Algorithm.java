public class Test_Algorithm {
    public static void main(String[] args) {
        int []A = {5, 24, 83, 39, 93, 83, 338, 21, 8, 99, 10};
        Straight_Min_Max mn = new Straight_Min_Max();

        Straight_Min_Max.MinMax result;
        result = mn.min_max(A);

        System.out.println(result.min);
        System.out.println(result.max);
    }
}
