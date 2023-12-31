import java.util.Scanner;

public class USSD {



    public void mainMenu(Account user) {
        Scanner input = new Scanner(System.in);

        Menu.displayMainMenu();


        int choice = input.nextInt();

        switch(choice){
            case 1-> menuAirtimeData(user);
            case 2-> cashFunctionality(user);
            case 3-> settings(user);
            default -> {
                System.out.println("Invalid choice, Retry");
                mainMenu(user);
            }
        }
    }

    private void settings(Account user) {
        System.out.println("This feature is not available");
        mainMenu(user);
    }

    private void cashFunctionality(Account user) {
        System.out.println("This feature is not available");
        mainMenu(user);
    }

    public void menuAirtimeData(Account user){
        Scanner scanner = new Scanner(System.in);
        String choice;


        Menu.displayAirtimeDataMenu();
        choice = scanner.nextLine();

        switch(choice){
            case "1"->{
                String commodity = "Airtime";
                purchaseFor(commodity, user);
            }

            case "2"->{
                String commodity = "Data";
                purchaseFor(commodity, user);
            }
            case "00"-> mainMenu(user);
            default -> menuAirtimeData(user);

        }
    }

    public void purchaseFor(String commodity, Account user){
        Scanner scanner = new Scanner(System.in);
        String choice;

        Menu.displayPurchaseForMenu(commodity);

        choice = scanner.nextLine();

        switch(choice){
            case "1"-> purchaseAmount(user, commodity);

            case "2"->{
                String number;


                do {
                    System.out.println("Enter the number in this format(0201234567): ");
                    number = scanner.nextLine();
                    user.validateNumber(number);

                    if (!user.validateNumber(number)) {
                        System.out.println("Invalid number, try again.");
                    }
                } while (!user.validateNumber(number));

                purchaseAmount(user, commodity);
            }
            case "00"-> menuAirtimeData(user);
            default -> {
                System.out.println("Invalid choice");
                purchaseFor(commodity, user);
            }
            }
        }


    public void purchaseAmount(Account user, String commodity){
        Scanner scanner = new Scanner(System.in);
        String choice;

        Menu.displayPurchaseAmountMenu();

        choice = scanner.nextLine();

        switch(choice){
            case "1"->{
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the amount: ");
                double amount = input.nextDouble();

                confirmPurchase(amount,user,commodity);
            }

            case "00"-> purchaseFor(commodity, user);
            default -> {
                System.out.println("Invalid choice, Retry");
                purchaseAmount(user, commodity);

            }

        }

    }


    public void confirmPurchase(double amount, Account user, String commodity){
        Scanner scanner = new Scanner(System.in);
        String choice;

        Menu.displayConfirmPurchaseaMenu();

        choice = scanner.nextLine();
        switch(choice){
            case "1"-> user.purchase(amount, commodity);
            case "2" ->{
                System.out.println("Sad you decided not to purchase anymore");
                System.exit(0);
            }

            case "00"-> purchaseAmount(user, commodity);

            default -> {
                System.out.println("Invalid choice. Retry");
                confirmPurchase(amount,user,commodity);
            }
        }

    }



}
