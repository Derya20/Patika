package Methods;

import java.util.Scanner;

public class PrimeNumbers {

    static void prime(){
        int number,result=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        number=scan.nextInt();
        if (number>2){
            for (int i = 2; i < number ; i++) {

                result= number%i;
                if (result==0){
                    System.out.println("Not a prime number! ");
                    break;
                }

            }
            if (result !=0){
                System.out.println("It's a prime number");
            }
        }
        switch (number) {
            case 0, 1 -> System.out.println("Not a prime!");
            case 2 -> System.out.println("It's a prime!");

        }

        prime();
    }
    public static void main(String[] args) {

        prime();

    }
}
