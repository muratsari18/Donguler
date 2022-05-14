//kullanıcı negatif sayı girene kadar ekrana girdiği sayıların teksayıları topla
import java.util.Scanner;
public class ekranagelentekSayilaribul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,sum=0;
      /*  boolean isSayiEksi=false;

        while (!isSayiEksi){
            System.out.print("Bir sayi giriniz :");
            sayi= input.nextInt();
            

            if (sayi<0)
                isSayiEksi=true;
            else if (sayi%2!=0)
                sum+=sayi;

        }*/
        do {
            System.out.print("Bir sayi giriniz:");
            sayi=input.nextInt();
            if (sayi%2==1)
                sum+=sayi;

        }while (sayi>0);
        System.out.println("Girdiginiz tum tek sayilarin toplami :" + sum);
    }
}
