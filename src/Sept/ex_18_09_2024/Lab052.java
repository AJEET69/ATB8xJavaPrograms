package Sept.ex_18_09_2024;

public class Lab052 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

    // A  -> ++a ->  Exp1 -> 11 , a = 11
    //  +
    // B- > ++a  ->  a = 12 , Exp2 = 12
    // 23 , 12
}
}
