package FirstPart;

import java.util.Scanner;

public class FindZodiac {
    /*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
     */
    public static void main(String[] args) {

        String month;
        int day;
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen doğduğunuz ayı giriniz: ");
        month=scan.next();
        System.out.print("Lütfen doğduğunuz günü giriniz: ");
        day =scan.nextInt();

        if (month.equalsIgnoreCase("Ocak")){
            if (day>=1 && day<=21){
                System.out.println("Oğlak");
            }else
                System.out.println("Kova");
        }
        if (month.equalsIgnoreCase("Şubat")){
            if (day >= 1 && day <=19){
                System.out.println("Kova");
            }else
                System.out.println("Balık");
        }
        if (month.equalsIgnoreCase("Mart")){
            if (day>=1 && day<=20){
                System.out.println("Balık");
            }else
                System.out.println("Koç");
        }
        if (month.equalsIgnoreCase("Nisan")){
            if (day>=1 && day<=20){
                System.out.println("Koç");
            }else
                System.out.println("Boğa");
        }
        if (month.equalsIgnoreCase("mayıs")){
            if (day>=1 && day<=21){
                System.out.println("Boğa");
            }else
                System.out.println("İkizler");
        }
        if (month.equalsIgnoreCase("Haziran")){
            if (day>=1 && day<=22){
                System.out.println("İkizler");
            }else
                System.out.println("Yengeç");
        }
        if (month.equalsIgnoreCase("Temmuz")){
            if (day>=1 && day<=22){
                System.out.println("Yengeç");
            }else
                System.out.println("Aslan");
        }
        if (month.equalsIgnoreCase("Ağustos")){
            if (day>=1 && day<=22){
                System.out.println("Aslan");
            }else
                System.out.println("Başak");
        }
        if (month.equalsIgnoreCase("Eylül")){
            if (day>=1 && day<=22){
                System.out.println("Başak");
            }else
                System.out.println("Terazi");
        }
        if (month.equalsIgnoreCase("Ekim")){
            if (day>=1 && day<=22){
                System.out.println("Terazi");
            }else
                System.out.println("Akrep");
        }
        if (month.equalsIgnoreCase("Kasım")){
            if (day>=1 && day<=22){
                System.out.println("Akrep");
            }else
                System.out.println("Yay");
        }
        if (month.equalsIgnoreCase("Aralık")){
            if (day>=1 && day<=22){
                System.out.println("Yay");
            }else
                System.out.println("Oğlak");
        }


    }
}
