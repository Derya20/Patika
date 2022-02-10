import java.util.Scanner;

public class ChineseZodiac {
    //Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
    public static void main(String[] args) {

        int birth, calc;

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter your date of birth: ");
        birth=scan.nextInt();

        calc=birth%12;
        System.out.print("Zodiac: ");
        switch (calc) {
            case 0 -> System.out.println("Maymun");
            case 1 -> System.out.println("Horoz");
            case 2 -> System.out.println("Köpek");
            case 3 -> System.out.println("Domuz");
            case 4 -> System.out.println("Fare");
            case 5 -> System.out.println("Öküz");
            case 6 -> System.out.println("Kaplan");
            case 7 -> System.out.println("Tavşan");
            case 8 -> System.out.println("Ejderha");
            case 9 -> System.out.println("Yılan");
            case 10 -> System.out.println("At");
            case 11 -> System.out.println("Koyun");
        }




    }
}
