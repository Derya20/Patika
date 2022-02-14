package Methods;

import java.util.Scanner;

public class Calculator {

    private static void plus(){
        int number, result = 0, i = 1, count;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number u wanna deal with? :");
        count=scan.nextInt();

        while (count>0) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            count--;
            result += number;
        }
        System.out.println("Result : " + result);

    }

    static void minus() {

        int number, result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();


        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }
    static void times() {
        int number, result = 1, i = 1,count;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number u multiply with? :");
        count=scan.nextInt();

        while (count>0) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            count--;
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        int n1, n2;
        double result;
        Scanner scan = new Scanner(System.in);
        System.out.print("First number :");
        n1=scan.nextInt();
        System.out.print("Second number: ");
        n2=scan.nextInt();

        result= n1%n2;
        System.out.println("Sonuç: "+result);


    }

    static void rectangular(){
        int kisaKenar, uzunKenar, result;
        Scanner scan=new Scanner(System.in);
        System.out.print("Dikdörtgenin kısa kenarı: ");
        kisaKenar=scan.nextInt();
        System.out.print("Dikdörtgenin uzun kenarı: ");
        uzunKenar=scan.nextInt();

        result=kisaKenar*uzunKenar;
        System.out.println("Result: "+result);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;
        String menu;
        menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap""";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                case 8:
                    rectangular();
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);




    }


}
