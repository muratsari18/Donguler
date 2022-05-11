import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String username, password;
        Scanner scan = new Scanner(System.in);

        int attemp = 3; // Kullanıcı giriş hakkı
        int select;
        int balance = 1500;

        while (attemp > 0) {
            System.out.print("Please enter your username :");
            username = scan.nextLine();

            System.out.print("Please enter your password :");
            password = scan.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                do {

                    System.out.println("1-Deposit Money \n" +
                            "2- Withdraw Money \n" +
                            "3-Ask your balance:\n" +
                            "4-Quit");
                    System.out.print("Please select one:");
                    select = scan.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Amaount of money you deposit!!");
                            int money = scan.nextInt();
                            balance += money;
                            break;
                        case 2:
                            System.out.print("Amaount of money you Withdraw!!");
                            int withDraw = scan.nextInt();
                            if (withDraw > balance)
                                System.out.println("There isn't enough money to withdraw");
                            else
                                balance -= withDraw;
                            break;
                        case 3:
                            System.out.println("Amount of your balance :" + balance);
                            break;

                    }

                } while (select != 4);
                break;
            } else {
                attemp--;
                System.out.println("Wrong username or password please try again");

                if (attemp == 0)
                    System.out.println("Your account is blocked. Please call your bank");
                else System.out.println("Remain Attemp!! :" + attemp);

            }

        }
    }
}
