package Belajar.Sesi7.liveCoding;

import java.util.Scanner;

public class liveCoding2 {
    public static void main(String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);
        System.out.print("Kecepatan Mbps: ");
        int mbps = inputan.nextInt();
        String kecepatan = null;

        if (mbps <= 10)
            kecepatan = "Lambat";
        else if (mbps <= 29) 
            kecepatan = "Cukup";
        else if (mbps <= 99) 
            kecepatan = "Cepat";
        else if (mbps > 100)
            kecepatan = "Sangat Cepat";

        System.out.print("Kecepatan sinyal mu: " + kecepatan);
        
        inputan.close();
    }
}
