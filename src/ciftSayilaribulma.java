import java.util.Scanner;
public class ciftSayilaribulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int k = scan.nextInt();
       /* int i =0;
        while (i<=k){
            if (i%3==0 && i%4==0)
                System.out.println(i);
            i++;*/
        for (int i =0;i<=k;i++){
            if (i%3==0 && i%4==0)
                System.out.println(i);
        }

    }
}
