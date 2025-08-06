package November.Generics_Demo;

public class MaxThreeNumbers {
    public static void main(String[] args) {
        // 34, 54, 76     >> int
        // 4.2, 3.4, 1.2  >> Double
        // p, z, a        >> String
        int maxPut = maximumNumberOf(34, 54, 76);
        System.out.println(maxPut);

    }

    public static int maximumNumberOf(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;

    }
}