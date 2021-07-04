import java.util.Scanner;

public class NotOrtalamasiProgrami {

    final static int dersSayisi = 6;


    static String[] dersler = {"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
    static int [] notlar = new int[dersSayisi];


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<dersSayisi ; i++){
            System.out.println(dersler[i]+" notunuzu giriniz :");
            notlar[i] = scanner.nextInt();
        }
        scanner.close();

        ortalamaHesapla(notlar);



    }


    private static void ortalamaHesapla(int[] notlar){
        float top = 0f;
        float ortalama ;

        for(int i=0 ; i<dersSayisi ; i++){
            top = (top + notlar[i]) ;
        }
        ortalama = top / dersSayisi;

        String sonuc = (ortalama>=60)?"Sınıfı Geçti":"Sınıfta Kaldı";


        System.out.printf("Not Ortalamasi : %.2f ( %s ) ",ortalama,sonuc);
    }


}
