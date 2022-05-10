import java.util.Scanner;
public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz  :");
        int n = scan.nextInt();
        double result = 0;
        for (int i =1; i<=n; i++){

            result+=(1.0/i);
        }
        System.out.println(result);
    }
}
