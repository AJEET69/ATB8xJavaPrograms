package Sept.Task;

public class Sept_27_Task002_Part3_First_5_With_Modules_Do_While {
    public static void main(String[] args) {
        int count = 0;    // To keep track of how many even number is even
        int number = 2;   // Start from the first even number

        do {
            if (number % 2 == 0){     // Check if the number is even
                System.out.println(number);  // Print the current even number
            count++;  // Continue until we've printed 5 even numbers

        }
        number++;
    } while (count < 5);
    }
}
