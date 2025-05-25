package Sept.Task;

public class Sept_18_Task002 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a++ + a-- );
        System.out.println(a);

        // 'A' --a  ->   Exp1 -> 9 , (a) = 9
        //  +
        // 'B' a++  ->   Exp2 -> 9 , (a) = 10
        //  +
        // 'C' aa-- ->  Exp3 -> 10 , (a)  = 9
        // "A+B+C" = 28
        // (a) 9


    }
}
