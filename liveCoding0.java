package Belajar.Sesi7.liveCoding;
import java.util.Scanner;
public class liveCoding0 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Stok= ");
        int stok = inputan.nextInt();

        if (stok < 1) 
            System.out.print("Stok habis");
         else if (stok > 0)
            System.out.print("Stok tersedia");

            inputan.close();
    }
}
