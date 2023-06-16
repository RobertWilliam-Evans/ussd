import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private String name;
    private String number;
    private double balance;

    public Account(String name, String number, double balance){
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public Account(){
        this.name ="Anonymous";
        this.number="0207257001";
        this.balance = 500;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void purchase(double amount, String commodity){
        if (balance <= amount) {

            System.out.println("Insufficient balance");
        }else if(amount <= 0){
            System.out.println("Amount must be greater than 0");

        }else{
            System.out.printf("Congrats! You just purchased GHc %s worth of %s", amount, commodity);
            balance -= amount;

        }

    }

    public boolean validateNumber(String number){
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();

    }




}
