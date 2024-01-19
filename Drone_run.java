package dasar;
import java.util.Scanner;
public class Drone_run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Drone run = new Drone();
        String lanjut;
        System.out.print("Energi = ");
        run.energi = input.nextInt();
        System.out.print("Ketinggian = ");
        run.ketinggian = input.nextInt();
        System.out.print("Keceopatan = ");
        run.kecepatan = input.nextInt();
        do{
        System.out.println("1. Terbang");
        System.out.println("2. Matikan mesin");
        System.out.println("3. Turun");
        System.out.println("4. Belok kiri");
        System.out.println("5. Belok kanan");
        System.out.println("6. Maju");
        System.out.println("7. Mundur");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                run.terbang();
                break;
            case 2:
                run.matikanMesin();
                break;
            case 3:
                run.turun();
                break;
            case 4:
                run.belokKiri();
                break;
            case 5:
                run.belokKanan();
                break;
            case 6:
                run.maju();
                break;
            case 7:
                run.mundur();
                break;
        }
        run.run();
            System.out.println("Lanjut? (y/n) ");
            lanjut = input.next();
        }while (lanjut.equalsIgnoreCase("y"));
    }
   
}
