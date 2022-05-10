import java.util.Scanner;
public class ustluSayiHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,u,total=1;
        System.out.print("Ustu alinacak Taban Sayisini Giriniz :");
        a=scan.nextInt();
        System.out.print("Ust Sayisini Giriniz :");
        u=scan.nextInt();


        for (int i=1; i<=u; i++)
        {
            total*=a;
        }
        System.out.println("Girdiginiz Sayinin ustu :" + total);
    }
}
