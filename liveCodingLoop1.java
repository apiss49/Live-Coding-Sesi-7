package Belajar.Sesi7.liveCoding;
import java.util.Scanner;
public class liveCodingLoop1 {
    public static void main(String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan K: ");
        int K = inputan.nextInt();
        System.out.print("Masukan N: ");
        int N = inputan.nextInt();

       for (int posisi = K; posisi <= N; posisi += K) {
        System.out.print(posisi + " ");
       }
       inputan.close();
    }
}