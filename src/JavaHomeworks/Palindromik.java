package JavaHomeworks;

import java.util.Scanner;

public class Palindromik {
    static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {


        String val;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kelimeyi giriniz: ");
         val=scan.nextLine();
        System.out.println(isPalindrome(val));


    }
}
