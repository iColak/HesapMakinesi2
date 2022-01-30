package methods;

import java.util.Scanner;

public class HesapMakinesi2 {
    /*


     */

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int mod(int a, int b){
        int result = a%b;
        System.out.println("Mod: " + result);
        return result;
    }

    static void alanCevre(int a, int b){
        int cevre = 2*(a+b);
        int alan = a*b;
        System.out.println("Çevre: " + cevre + " alan: " + alan);

    }

    public static void main(String[] args) {
        String islemler = "1- Toplama İşlemi\n" +
                "2- Mod Alma\n" +
                "3- Dikdörtgen Alan ve Çevre Hesabı";
        int secim, sayi1, sayi2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi2 = scanner.nextInt();

        do {
            System.out.print("İşlem Seçiminizi Yapınız: ");
            secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    sum(sayi1, sayi2);
                    break;
                case 2:
                    mod(sayi1,sayi2);
                    break;
                case 3:
                    alanCevre(sayi1,sayi2);
                    break;
                case 0:
                break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (secim != 0);

    }
}
