import java.util.Scanner;

public class BodyMassIndex {
    /*
    Kilo (kg) / Boy(m) * Boy(m)
     */
    public static void main(String[] args) {

        double kilo,boy, index;

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy=scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo=scan.nextDouble();
        index =kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : "+ index);




    }
}
