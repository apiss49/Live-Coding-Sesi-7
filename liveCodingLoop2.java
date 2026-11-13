package Belajar.Sesi7.liveCoding;

import java.util.Scanner;
public class liveCodingLoop2 {
    public static void main(String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan N tiket:");
        int N = inputan.nextInt();
        
        int sisa = N;
        while (sisa > 0) {
            sisa--;
            System.out.println("sisa tiket: " + sisa);
        }
        System.out.println("tiket habis!");
        inputan.close();
    }
}