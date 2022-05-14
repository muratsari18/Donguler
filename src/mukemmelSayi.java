import java.util.Scanner;
public class mukemmelSayi {
public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz :");
		int number = scan.nextInt();
		int total=0;
		
		for(int i=1; i<=number; i++) {
			if(number%i==0)
				total+=i;
		}
		if(total==(2*number))
			System.out.println(number + " mükemmel bir sayıdır");
		else
			System.out.println(number + " mükemmel bir sayı DEĞİLDİR");
			
	}
}

