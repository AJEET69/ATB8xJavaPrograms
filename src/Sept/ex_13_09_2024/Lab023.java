package Sept.ex_13_09_2024;

public class Lab023 {
    public static void main(String[] args) {

       //>>Literals
        // Boolean
        // Integral
        // Char
        // Single Char

        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';


        System.out.println("Lucky"+ new_line +  "Singh");

        // System.out.println("Lucky"+ '\n' +  "Singh");

        System.out.println("Lucky"+ tab_line +  "Singh");
        System.out.println("Lucky"+ back_space +  "Singh");
        System.out.println("Lucky"+ car_r +  "Singh");

        char c11  = '\u1F60'; //65 - ASCII


        // china - india, japan -> unicode
        // /u09878

        System.out.println(c11); // ὠ - :) emoji




    }
}
