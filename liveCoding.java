package Belajar.Sesi7.liveCoding;
import java.util.Scanner;
public class liveCoding {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan tinggi badan orang pertama: ");
        int tinggiBadan1 = inputan.nextInt();
        
        System.out.print("Masukan tinggi badan orang ke-2: ");
        int tinggiBadan2 = inputan.nextInt();

        if (tinggiBadan1 > tinggiBadan2) {
            System.out.print("Orang pertama lebih tinggi dari orang ke-2");
        } else if (tinggiBadan2 > tinggiBadan1) {
            System.out.print("Orang ke-2 lebih tinggi dari orang pertama");
        } else if (tinggiBadan1 == tinggiBadan2) {
            System.out.print("Tinggi badan sama");
        }
        inputan.close();
    }
}