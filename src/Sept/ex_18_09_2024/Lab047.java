package Sept.ex_18_09_2024;

public class Lab047 {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
        // Pre and Post
        // Ready

        // pre - increment - ++operand.
        // value is incremented first and then stored in the result.
        int a  = 10;
        int b  = ++a; // a = a+1

        //  | a |output (b)|
        //   10
        //   11 | 11
       // System.out.println(b);
       // System.out.println(a);

      // int a = 10;
      // System.out.println(++a);
      // System.out.println(a);

        // Post  a++
        // Print first and then increase

        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

    }
}
