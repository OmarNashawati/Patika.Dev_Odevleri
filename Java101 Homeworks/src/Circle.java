import java.util.Scanner;

public class Circle {
    /** Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;

        Yarıçapı r, merkez açısısının ölçüsü a olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * a) / 360        */


    final static double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz (r): ");
        double r = scanner.nextDouble();
        System.out.println("diliminin merkez açısısının ölçüsü giriniz (a): ");
        double a = scanner.nextDouble();
        scanner.close();

        alan(r);
        cevre(r);
        dilimAlani(r,a);

    }

    private static void alan(double r){
        double alan = PI*r*r;
        System.out.printf("Dairenin Alanı = %.2f",alan);

    }

    private static void cevre(double r){
        double cevre = 2*PI*r;
        System.out.printf("Dairenin Çevresı = %.2f",cevre);

    }

    private static void dilimAlani(double r,double a){

        double dilimAlani = (PI*r*r*a) / 360 ;
        System.out.printf("Dilim Alanı = %.2f",dilimAlani);

    }


}
