import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the short code: ");
        String shortCode = input.nextLine();

        USSD ussd = new USSD();
        Account user = new Account();


        if(shortCode.equals("*455#")){
            ussd.mainMenu(user);


        }else{
            System.out.println("Invalid shortcode");

        }


    }
}

