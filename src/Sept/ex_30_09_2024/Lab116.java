package Sept.ex_30_09_2024;

public class Lab116 {
    public static void main(String[] args) {

        //  1.Without Parameters and Without Return Type
        function_type1();


        // 2.Without Parameters but With Return Type
        int age = function_type2();
        System.out.println(age);


        // 3.With Parameters and Without Return Type
        function_type3(12,"Ajeet","mr",69);


        // 4. With Parameters and With Return Type
        double result = function_type4(6,9);
        System.out.println(result);

    }
    //  1.Without Parameters and Without Return Type

    public static void function_type1() {
        System.out.println("1.Without Parameters and Without Return Type");


    }
    // 2.Without Parameters but With Return Type
    public static int function_type2() {
        System.out.println("2.Without Parameters but With Return Type");
        return 69;


    }
    // 3.With Parameters and Without Return Type
    public static void function_type3(int age2,String name,String firstname,int age){
        System.out.println("3.With Parameters and Without Return Type");
        System.out.println("You have shared -> " + name);


    }
    // 4. With Parameters and With Return Type
    static double function_type4(int a,double b){
        System.out.println("4. With Parameters and With Return Type");
        return a+b;

    }


}
