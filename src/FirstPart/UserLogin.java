package FirstPart;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        String userName, passw, newPassw;
        int answer;

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter your user name: ");
        userName=scan.nextLine();
        System.out.print("Please enter your password: ");
        passw=scan.nextLine();

        if (passw.equals("Java1234") && userName.equals("Derya20")){
            System.out.println("Giriş başarılı");
        }else{
            System.out.println("Bilgileriniz yanlış !");
            if (userName.equals("Derya20")){
                System.out.println("Şifrenizi değiştirmek ister misiniz?");
                System.out.println("1-Evet\n2-No");
                answer=scan.nextInt();

                if (answer==1){
                    scan.nextLine();
                    System.out.print("New password: ");
                    newPassw=scan.nextLine();
                    if (newPassw.equals("Java1234")){
                        System.out.println("Şifreniz eski şifrenizle aynı olamaz!");
                    }else
                        System.out.println("Şifre oluşturma başarılı");
                }
            }

        }



    }
}
