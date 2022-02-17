package FirstPart;

import java.util.Scanner;


/*
Formula

Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

 */
public class UcgenAlan {

    public static void main(String[] args) {

        int kenar1, kenar2,kenar3,cevre,  u;
       double alan;

        Scanner input=new Scanner(System.in);

        System.out.println("Üçgenin ilk kenarını giriniz: ");
        kenar1=input.nextInt();
        System.out.println("Üçgenin ikinci kenarını giriniz: ");
        kenar2=input.nextInt();
        System.out.println("Üçgenin üçüncü kenarını giriniz:");
        kenar3=input.nextInt();

        u=(kenar1+kenar2+kenar3)/2;

        cevre=u*2;

        alan= Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));


        System.out.println("Üçgenin çevresi :"+cevre);
        System.out.println("Girdiğiniz verilere göre üçgenin alanı :"+alan);











    }
}
