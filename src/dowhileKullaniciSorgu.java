import java.util.Scanner;
public class dowhileKullaniciSorgu {
    public static void main(String[] args) {
        int password;
        boolean askPassword=true;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Sifrenizi Giriniz: ");
            password=scan.nextInt();

            if (password==123){
                System.out.println("Dogru şifre");
                askPassword=false;
            }
            else
                System.out.println("Yanlis Sifre tekrar giriniz");
        }while (askPassword);
    }
}
