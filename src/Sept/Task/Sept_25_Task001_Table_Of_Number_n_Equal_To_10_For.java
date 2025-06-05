package Sept.Task;

import java.util.Scanner;

public class Sept_25_Task001_Table_Of_Number_n_Equal_To_10_For {
    // Table of  number n = 10, print with for or while.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number\n");
        int n = sc.nextInt();
        System.out.println("Multiple of Table");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n + "x" +i + " = " + (n*i));

        }


    }
}

