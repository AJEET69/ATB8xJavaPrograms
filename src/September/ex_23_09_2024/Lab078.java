package September.ex_23_09_2024;

public class Lab078 {
    public static void main(String[] args) {
        int itemCode = 001; // JDK  >13
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");

            // -> only for 1 liner

        }
    }
}
