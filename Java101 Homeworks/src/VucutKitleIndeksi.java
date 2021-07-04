import java.util.Scanner;

public class VucutKitleIndeksi {

    /** Formül
      * Kilo (kg) / Boy(m) * Boy(m)
      */

    public static void main(String[] args){

        //kullanıcıadn boyu ve kilosu almak.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        float boy = scanner.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz :");
        float kilo = scanner.nextFloat();
        scanner.close();

        //Vücut Kitle İndeksi hesaplamak.
        float vucutKitleIndeksi = vucutKitleIndeksiHesapla(boy,kilo);

        //Çıktılar
        System.out.println("Vücut Kitle İndeksiniz : "+ vucutKitleIndeksi);



    }
    //Vücut Kitle İndeksi hesaplayan method.
    private static float vucutKitleIndeksiHesapla(float boy,float kilo){
        float vucutKitleIndeksi = kilo / (boy * boy);
        return vucutKitleIndeksi;
    }
}
