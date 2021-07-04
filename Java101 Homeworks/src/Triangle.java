import java.util.Scanner;

public class Triangle {

    //Üçgenin kenarlarının uzunluğu
    static float s1,s2,s3;


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci kenarın uzunluğu giriniz: ");
        s1 = scanner.nextFloat();
        System.out.println("İkinci kenarın uzunluğu giriniz: ");
        s2 = scanner.nextFloat();
        System.out.println("Üçüncü kenarın uzunluğu giriniz: ");
        s3 = scanner.nextFloat();
        scanner.close();

        alanHesapla(s1,s2,s3);
        cevreHesapla(s1,s2,s3);
    }

    private static void alanHesapla(float s1,float s2 , float s3){

        float u = (s1+s2+s3)/2;
        double alan = Math.sqrt(u*(u-s1)*(u-s2)*(u-s3));
        System.out.println("Üçgenin Alanı = "+alan);
    }

    private static void cevreHesapla(float s1,float s2 , float s3){
        float cevre = s1+s2+s3 ;
        System.out.println("Üçgenin çevresi = "+cevre);
    }

}
