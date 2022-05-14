import java.util.Scanner;
public class tersUcgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Üçgen kaç basamaklı olsun ? : ");
        int number=input.nextInt();
        int yildiz = 2*number-1;
        
        for (int i=1; i<=number; i++){
        	
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            
            for (int k=1; k<=(yildiz); k++){
                System.out.print("*");
                }
            
            System.out.println();
            yildiz-=2;
        }
        
    }
}
