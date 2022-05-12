import java.util.Scanner;

public class ebob_Ekok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz :");
        int n = scan.nextInt();
        int ebob = 0;
        int ekok=0;
        System.out.print("Lutfen bir sayi giriniz :");
        int m = scan.nextInt();
        int i = 1;
        int k=1;

        if (n < m) {

            while (i <= n) {
                if (n % i == 0 && m % i == 0) 
                    ebob = i;
                i++;

            }
        } else {
            while (i <= m) {
                if (n % i == 0 && m % i == 0) 
                    ebob = i;
                i++;
            }

        }
        System.out.println(ebob);
        System.out.println((n*m)/ebob);
    }
}

