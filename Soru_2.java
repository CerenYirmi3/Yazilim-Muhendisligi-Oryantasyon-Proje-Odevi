package soru_2;
import java.util.Scanner;
class Soru_2{
    public static void main (String [] args)
    {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Cinsiyetinizi Giriniz (kadın=k,erkek=e)");
        String cinsiyet = klavye.nextLine();
        System.out.println("Adım Sayısını Giriniz");
          int adim_sayisi = klavye.nextInt();

         
        if ((cinsiyet).equals("k")) 
        {
           double kalori = (adim_sayisi * 30)/500; 
            System.out.println("Kalori:"+ kalori);
        }
        else
        {
           double kalori = (adim_sayisi * 45)/500;
           System.out.println("Kalori:"+ kalori);
        }
    }
}
