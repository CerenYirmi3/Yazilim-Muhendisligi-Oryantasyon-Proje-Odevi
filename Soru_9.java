package soru_9;
import java.util.Scanner;
public class Soru_9
{
  public static void main(String [] args)
  {
     Scanner klavye = new Scanner(System.in);
    System.out.println("Lütfen bir sayı giriniz");
    int sayi = klavye.nextInt();
    int RakamlarToplami = 0;
    int BasamakSayisi = 0; 
    int RakamlarCarpimi = 1;
     if (sayi % 2 == 0)
     {
       while( sayi != 0)
        {
          int rakam = sayi % 10;
           sayi = sayi / 10;
           RakamlarToplami = RakamlarToplami + rakam; 
           BasamakSayisi++;
        }
       double AritmetikOrtalama;
        AritmetikOrtalama = RakamlarToplami / BasamakSayisi;
       System.out.println("Sayının aritmetik ortalaması: " + AritmetikOrtalama);
     }
     else
     {
        while( sayi != 0)
        {
          int rakam = sayi % 10;
          sayi = sayi / 10;
          RakamlarCarpimi = RakamlarCarpimi * rakam;
          BasamakSayisi++;          
        }
      double GeometrikOrtalama;
       GeometrikOrtalama = Math.pow( RakamlarCarpimi , (1.0/BasamakSayisi)); 
      System.out.println("Sayının geometrik ortalamasi: " + GeometrikOrtalama);
     }
  }
}