import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        int year;
        Scanner scan = new Scanner(System.in);

        year = scan.nextInt();

        if (year % 4 == 0) {
            if ((year % 100 == 0) && (year % 400 == 0)) {
                System.out.println("Leap year: " + year);
            } else
                System.out.println("It's not a leap year!");
        }      else {
            System.out.println("Not a leap year");
        }
    }


}
