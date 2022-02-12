package Loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        String userName, passw;
        int right=3, balance=2000, select = 0, price;

        Scanner scan=new Scanner(System.in);


        while (right>0 && select!=4){
            System.out.print("Kullanıcı adı giriniz: ");
            userName=scan.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            passw=scan.nextLine();
            if (userName.equals("JavaLife")&& passw.equals("Techno123")){
                System.out.println("Merhaba, xxx Bankasına hoşgeldiniz.");
                do {
                    System.out.println("""
                        1-Para yatırma
                        2-Para Çekme
                        3-Bakiye Sorgula
                        4-Çıkış Yap""");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select=scan.nextInt();

                    switch (select) {
                        case 1 -> {
                            System.out.print("Para miktarı : ");
                            price = scan.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("Para miktarı : ");
                            price = scan.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                        }
                        case 3 -> System.out.println("Bakiyeniz : " + balance);
                    }
                }while (select != 4);
            }else {
                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı!");
                System.out.println("Lütfen tekrar deneyiniz");

                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur!");
                    System.out.println("Bankayla iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız: "+right);
                }
            }
        }



    }
}
