import java.util.Scanner;

public class konbinasyon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r;
        int nFak = 1, rFak = 1, n_rFak = 1;
        double conbination = 0;

        System.out.print("N eleman sayisini giriniz :");
        n = scan.nextInt();

        System.out.print("R eleman sayisini giriniz :");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            nFak *= i;

        }
        System.out.println("N fak: " + nFak);
        for (int j = 1; j <= r; j++) {
            rFak *= j;
        }
        System.out.println("R fak: " + rFak);
        for (int k = 1; k <= n - r; k++) {
            n_rFak *= k;
        }
        System.out.println("n-R Fak :" + n_rFak);
        conbination = nFak / (rFak * n_rFak);
        System.out.println("Konbinasyon Formul Sonucu : " + conbination);
    }
}
