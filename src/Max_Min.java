import java.util.Scanner;
public class Main {
	public static void main(String[]args)
	{
	 Scanner scan = new Scanner(System.in);
	 System.out.print("Lütfen bir sayı giriniz :");
	 int number = scan.nextInt();
	 int sayi=0;
	 int max=1, min=0;
	 
	 for(int i = 1; i<=number; i++) {
		 sayi++;
		 System.out.print(sayi + ". sayıyı giriniz :");
		 int numberDeger = scan.nextInt();
		 if(numberDeger>=max)
			 max=numberDeger;
		 else if(numberDeger <max)
			 min=numberDeger;
	 }
	 System.out.println("En büyük sayi :" + max);
	 System.out.println("En küçük sayi :" + min);
	}
}
