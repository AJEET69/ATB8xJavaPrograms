package Sept.Task;

public class Sept_18_Task003 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a-- + a-- + a--);
        System.out.println(a);

        // 'A' a--  ->   Exp1 -> 10 , (a) = 9
        // +
        // 'B' a--  ->   Exp2 -> 9 , (a) = 8
        //  +
        // 'C' aa-- ->   Exp3 -> 8 , (a)  = 7
        // "A+B+C" = 27
        // (a) 7

    }
}
