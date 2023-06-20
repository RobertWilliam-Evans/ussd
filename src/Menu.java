public class Menu {

    public static void displayMainMenu() {
        System.out.println("1. Buy Airtime or Data");
        System.out.println("2. Cash");
        System.out.println("3. Settings");
    }

    public static void displayAirtimeDataMenu() {
        System.out.println("1. Buy Airtime");
        System.out.println("2. Buy Data");
        System.out.println("00. Go Back");
    }

    public static void displayPurchaseForMenu(String commodity) {
        System.out.printf("1. Buy %s for yourself\n", commodity);
        System.out.printf("2. Buy %s for someone\n", commodity);
        System.out.println("00. Go Back");
    }

    public static void displayPurchaseAmountMenu() {
        System.out.println("1. Enter the amount you want to buy");
        System.out.println("00. Go Back");
    }

    public static void displayConfirmPurchaseaMenu() {
        System.out.println("Are you sure you want to buy");
        System.out.println("1. Yes");
        System.out.println("2. Cancel");
        System.out.println("00. Go Back");
    }
}
