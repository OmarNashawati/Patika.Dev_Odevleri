import java.util.Scanner;

public class TaxiMetre {

    /** Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir. */

    static float tutar  ;

    final static int minTutar = 20;
    final static int acilis_Ucreti = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taxi ile gidilen mesafe giriniz: ");
        float mesafe = scanner.nextFloat();
        scanner.close();

        tutar = mesafe*2.20f + acilis_Ucreti;

        if(tutar<20){
            System.out.printf("tutar = %.1fTL%n",tutar);
            System.out.printf("ödenecek tutar = %dTL",minTutar);
        }else{
            System.out.printf("tutar = %.1fTL%n",tutar);
            System.out.printf("ödenecek tutar = %.1fTL",tutar);
        }

    }
}