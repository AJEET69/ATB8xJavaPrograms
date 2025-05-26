package Sept.Task;

public class Sept_20_Task002 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 45;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c ) ? b : c);
        int min = (a < b) ? ((a < c) ? a : c) : ((b < c ) ? b : c);
        System.out.println(max);
        System.out.println(min);


    }
}
