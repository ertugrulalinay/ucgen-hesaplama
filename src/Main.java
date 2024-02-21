import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerimizi oluşturalım
        double a,b,c,u,alan;

        //Kullanıcıdan verilerimizi alalım
        Scanner girdi = new Scanner(System.in);
        System.out.println("1.Kenarı Giriniz : ");
        a = girdi.nextDouble();
        System.out.println("2.Kenarı Giriniz : ");
        b = girdi.nextDouble();
        System.out.println("3.Kenarı Giriniz : ");
        c = girdi.nextDouble();

        u = (a + b + c) / 2 ;

        alan = Math.sqrt(u *(u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı : " + alan);





    }
}