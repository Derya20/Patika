import java.util.Scanner;

public class PassTheClass {
    public static void main(String[] args) {

        double fizik,kimya,mat,turkce,muzik;
        double average;

        Scanner scan=new Scanner(System.in);


        System.out.print("Matematik notunuzu giriniz: ");
        mat=scan.nextDouble();
        if (mat<0 || mat>100){
            System.out.println("Invalid input! Please try again");
            System.out.print("Matematik notunuzu giriniz: ");
            mat=scan.nextDouble();
        }
        System.out.print("Fizik notunuzu giriniz: ");
        fizik=scan.nextDouble();
        if (fizik<0 || fizik>100){
            System.out.println("Invalid input! Please try again");
            System.out.print("Fizik notunuzu giriniz: ");
            fizik=scan.nextDouble();
        }
        System.out.print("Kimya notunuzu giriniz: ");
        kimya=scan.nextDouble();
        if (kimya<0 || kimya>100){
            System.out.println("Invalid input! Please try again");
            System.out.print("Kimya notunuzu giriniz: ");
            kimya=scan.nextDouble();
        }
        System.out.print("Müzik notunuzu giriniz: ");
        muzik=scan.nextDouble();
        if (muzik<0 || muzik>100){
            System.out.println("Invalid input! Please try again");
            System.out.print("Müzik notunuzu giriniz: ");
            muzik=scan.nextDouble();
        }
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=scan.nextDouble();
        if (turkce<0 || turkce>100){
            System.out.println("Invalid input! Please try again");
            System.out.print("Türkçe notunuzu giriniz: ");
            turkce=scan.nextDouble();
        }


        average= (mat+fizik+kimya+muzik+turkce)/5;

        System.out.println("Notunuz: " +average);
        if (average >=55) {
            System.out.println("Sınıfı geçtiniz!");
        }else
            System.out.println("Sınıfta kaldınız!");




    }
}
