
public class asalSayi1_100 {
public static void main(String[]args) {

	int sayac=0;
	for(int i=2;i<=100; i++) {
		for(int k=2; k<=100; k++) {
			if(i%k==0)
				sayac ++; // eğer tam bölünüyorsa sayacı arttırıyoruz
		}
		if(sayac<2)
			System.out.print(i + ","); // Eğer sayı birden kez bölünmemişse o i değerini ekrana basıyoruz
		sayac=0; // Sayac 0 lanarak içerisindeki bilgi sıfırlanıyor ve tekrar döngüye giriyor.
	}
	
}
}
