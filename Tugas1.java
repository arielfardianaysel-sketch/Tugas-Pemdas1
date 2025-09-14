package PEMDAS.kelas;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("--- Program Menghitung Nilai EK, EP dan EM ---");
        //deklarasi
        double g, m, v, h, Ek, Ep, Em;


        //memasukan input
        System.out.printf("%-30s = ", "Percepatan gravitasi (m/s2)");
        g = user.nextDouble();
        System.out.printf("%-30s = ", "Massa benda (kg)");
        m = user.nextDouble();
        System.out.printf("%-30s = ", "Kecepatan benda (m/s)");
        v = user.nextDouble();
        System.out.printf("%-30s = ", "Ketinggian (m)");
        h = user.nextDouble();

        //hitung em, ek, ep
        Ek = (m*v*v)/2;
        Ep = m*g*h;
        Em = Ek+Ep;
        System.out.printf("%-30s = %.2f\n", "Energi Kinetik", Ek);
        System.out.printf("%-30s = %.2f\n", "Energi Potensial", Ep);
        System.out.printf("%-30s = %.2f\n", "Energi Mekanik", Em);

        user.close();
    }
}
