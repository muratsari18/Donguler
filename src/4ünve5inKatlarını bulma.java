import java.util.Scanner;

public class dortVeBesinKati {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        n = scan.nextInt();
        int sayac=0;

        for (int i = 1, j = 1; i <= n && j <= n; i *= 4, j *= 5)

        {
            System.out.println("i'nin 4^ " +sayac+" kuvveti icin : "+i);
            System.out.println("j'nin 5^ "+sayac+" kuvveti icin :"+j);
            sayac ++;

        }




        }

    }

