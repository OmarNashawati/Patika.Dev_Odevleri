import java.util.Scanner;

public class KdvTutari {


   /** Eğer girilen tutar 0 ve 1000 TL arasında ise KDV
       oranı %18 , tutar 1000 TL'den büyük ise KDV oranını
       %8 olarak KDV tutarı hesaplayan programı yazınız.

       girdiler:
           tutar = 11.8
       çıktılar:
           KDV'siz Fiyat = 10
           KDV'li Fiyat = 11.8
           KDV tutarı = 1.8                */


    static double girilenTutar ;

    final static double yuzde18Kdv = 0.18;
    final static double yuzde8Kdv  = 0.08;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tutarı giriniz: ");
        girilenTutar = scanner.nextDouble();
        scanner.close();


        kdvHesapla(girilenTutar);

    }


    private static void kdvHesapla(double tutar){

        double kdvTutari;
        double kdvsizTutar ;

        if(tutar>=0 && tutar<=1000){
            kdvsizTutar = tutar / (yuzde18Kdv+1);
        }else{
            kdvsizTutar = tutar / (yuzde8Kdv+1);
        }

        kdvTutari = tutar - kdvsizTutar;

        System.out.printf("KDV'siz Fiyat = %.1f%n",kdvsizTutar);
        System.out.printf("KDV'li Fiyat  = %.1f%n" ,tutar);
        System.out.printf("KDV tutarı    = %.1f"   ,kdvTutari);

    }

}
