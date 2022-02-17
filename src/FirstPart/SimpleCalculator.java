package FirstPart;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        int number1, number2,select;

        Scanner scan=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        number1=scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        number2=scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiniz: ");
        select=scan.nextInt();

        switch (select) {
            case 1 -> System.out.println("Sonuç: " + (number1 + number2));
            case 2 -> System.out.println("Sonuç: " + (number1 - number2));
            case 3 -> System.out.println("Sonuç: " + (number1 * number2));
            case 4 -> System.out.println("Sonuç: " + (number1 / number2));
            default -> System.out.println("Invalid input for select!");
        }
    }
}
