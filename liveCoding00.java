package Belajar.Sesi7.liveCoding;
import java.util.Scanner;
public class liveCoding00 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Saldo: ");
        int saldo = inputan.nextInt();

        if (saldo >= 50000)
            System.out.print("Transaksi dapat dilakukan");
        else if (saldo < 50000)
            System.out.print("Saldo tidak mencukupi");

        inputan.close();
    }

}
