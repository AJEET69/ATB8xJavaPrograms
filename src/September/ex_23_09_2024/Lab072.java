package September.ex_23_09_2024;

public class Lab072 {
    public static void main(String[] args) {
  //   Web  Automation
  //   I will ask user which browser you want me to run the code.
  //   chrome ->  execute chrome
 //    firefox -> execute of firefox
  //   edge ->   edge cases
        String browser = "firebox";

        switch (browser) {
            case "chrome":
            System.out.println("Starting the chrome browser");
            // Further code to start the chrome
            // Webdriver  driver + new Chrome(); // Selenium Code
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the chrome
                // Webdriver  driver + new Firefox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;




        }
    }
}
