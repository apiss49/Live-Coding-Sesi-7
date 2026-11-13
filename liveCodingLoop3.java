package Belajar.Sesi7.liveCoding;
import java.util.Scanner;
public class liveCodingLoop3 {
    public static void main(String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan N:");
        int N = inputan.nextInt();

        int count = 0;
        int sum = 0;

        for (int i=1; i<=N; i++) {
            if (i % 2 == 0 || i % 5 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("Count = " + count + ": sum" + sum);
        inputan.close();
    }
}
