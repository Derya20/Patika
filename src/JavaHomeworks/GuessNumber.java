package JavaHomeworks;

import java.util.Scanner;

/*
Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı
 kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
 */
public class GuessNumber {
    public static void main(String[] args) {

        int number,value;
        int count=0;



        Scanner scan=new Scanner(System.in);
        while (count<3){
            number=(int)(Math.random()*100);
            System.out.print("Please enter a number: ");
            value=scan.nextInt();
            if (number==value){
                System.out.println(number+ " - "+ value);
                System.out.println("You win!");
            }else
                System.out.println(number+ " - "+ value);
                System.out.println("You lost! ");

            count++;
        }

        System.out.println("The game is over!");

    }
}
