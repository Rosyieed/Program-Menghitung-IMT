import java.util.Scanner;

public class IMTMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IMT bb = new IMT(0, 0);
        System.out.println("PROGRAM IMT");
        System.out.print("Berat Badan (kg)  : ");
        bb.beratBadan = input.nextDouble();
        System.out.print("Tinggi Badan (cm) : ");
        bb.tinggiBadan = input.nextDouble();
        
        System.out.println("==================================================");
        
        System.out.println("Nilai IMT: " + bb.hitung());
        bb.nilai();
    }
    
}
