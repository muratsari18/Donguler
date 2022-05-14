import java.util.*;
public class fibonacciSayisi {
	public static void main(String[]args) {
	Scanner scan = new Scanner (System.in);
	System.out.print("Lütfen bir sayı giriniz :");
	int number = scan.nextInt();
	int firstNumber=0,secondNumber=1,numberNew; // İlk değerleri elle biz giriyoruz
	
	System.out.print(firstNumber + " " + secondNumber + " ");  // İlk iki değerleri yazdırıyoruz
	
	for(int i =1; i<number; i++) { // Kullanıcının girdiği değer kadar döngü döndürüyoruz.
			
			numberNew=firstNumber + secondNumber; // Başta verdiğimiz iki sayıyı toplayıp numberNew e atama yapıyoruz
			System.out.print(numberNew + " ");  // Her seferinde bu yeni sayı ekrana basılıyor.
			
			firstNumber=secondNumber; // ve sayılar bir sonraki ile yer değişiyor  SecondNumber => FirstNumber'ın içine atanıyor.
			
			secondNumber=numberNew; //  NumberNew => SecondNumber'ın içine atanıyor
			                        // bu işlem yapılmazsa sürekli aynı numaraları basarız.
	    
	    }
	}
}
	
