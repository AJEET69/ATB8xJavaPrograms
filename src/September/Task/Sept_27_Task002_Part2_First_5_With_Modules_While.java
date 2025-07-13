package September.Task;

public class Sept_27_Task002_Part2_First_5_With_Modules_While {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while(count < 5) {
            if (number %2 ==0){
                System.out.println(number);
                count++;

            }
            number++;
        }
    }
}
