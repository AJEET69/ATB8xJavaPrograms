package September.ex_23_09_2024;

public class Lab069 {
    public static void main(String[] args) {
        // Switch condition
        // Days - 1 to 7 -> 1 mon, 2- tue , 7 - sun ..
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thus");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea, what day its");
        }
        System.out.println("End of the loop");
    }
}
