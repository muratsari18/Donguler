// Bu programda kullanıcıdan girilen sayı şeklinde yıldız pramiti yapılacak.
//2. bir döngü kullanılarak pramit terse basılıp şekiller birleşecek
import java.util.Scanner;
public class yildizBasan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;

        System.out.println("Lutfen bir sayi giriniz :");
        sayi= scan.nextInt();


        for (int i=1; i<=sayi; i++) // Girilen sayi kadar satir oluşturduk sayi = 6 ise 6 satırımız var
        {

            for (int k=1; k<=sayi-i; k++) //Algoritmamıza göre 1 den sayi-i ye kadar döngümüz ile her satırda boşluk
                                          // koyacağız sayi= 6 ise ilk satirda 5 boşluk
            {
                System.out.print(" ");
            }

            for (int j=1; j<=(2*i-1); j++) // ilk satirimizda boşluktan sonra yildiz koyacak döngü ile 2,3..6 satira
                                           // kadar yildiz basacak
            {
                System.out.print("*");
            }
            System.out.println(); // Her satırdan sonra alt satıra iner
        }
        for (int tersi=1; tersi<=sayi-1; tersi++){

           for (int ktersi=1; ktersi<=tersi; ktersi++){
               System.out.print(" ");
           }
           for (int jters=1; jters<=(((sayi-1)*2)-(2*tersi-1));jters++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
