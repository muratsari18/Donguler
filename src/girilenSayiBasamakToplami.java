import java.util.Scanner;
public class GirilenSayininBasamakDegerToplam {
    public static void main(String[] args) {
        int number,numberValue,numberToplam=0;


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        number=scan.nextInt();
        while (number!=0){
            numberValue=number % 10;     // sayının son basamak değerini alıyoruz
            numberToplam+=numberValue;   //ve bu değerleri topluyoruz
            number=number/10;            //Sayının basamak değeri azalıyor ve döngü tekrar başa dönüyor.
        }
        System.out.println("Girdiginiz sayilarin toplami = " + numberToplam);
        }
}
