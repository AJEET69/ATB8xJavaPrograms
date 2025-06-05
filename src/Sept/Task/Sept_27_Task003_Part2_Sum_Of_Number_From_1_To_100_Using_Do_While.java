package Sept.Task;

public class Sept_27_Task003_Part2_Sum_Of_Number_From_1_To_100_Using_Do_While {
    public static void main(String[] args) {

        int sum = 0;  // Variable to hold the sum
        int i = 1;    // Starting point

        do {
            sum += i;  // Add i to sum
            i++;       // Increment i

        } while (i <= 100);  // Continue until i is greater than 100
        System.out.println("The sum of the number 1 to 100 is: " + sum);

    }
}
