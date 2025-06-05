package Sept.Task;

public class Sept_27_Task002_First_5_Even_Numbers_Do_While_Loop {
    public static void main(String[] args) {

        // first 5 even numbers using a do-while loop

        int count = 1;
        int number = 2;
        do {
            System.out.println(number);
            number += 2;
            count++;
        } while (count <= 5);

    }
}
