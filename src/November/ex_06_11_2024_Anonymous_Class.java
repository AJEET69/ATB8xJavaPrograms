package November;

public class ex_06_11_2024_Anonymous_Class {

    public static void main(String[] args) {
        I1 i = new I1() {
            @Override
            public void display() {
                System.out.println("AC Display Function");
            }
        };
    }
}
interface I1{
    void display();
}
