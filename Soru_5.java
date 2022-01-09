package soru_5;
import java.util.Scanner;
public class Soru_5 
{
    public static void main(String[] args) 
    {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz.");
        int sayi = klavye.nextInt();
        int BasamakSayisi = 0;
        int CiftRakamlarToplami = 0;
        int TekRakamlarToplami = 0;
           while( sayi != 0)
          {
            int rakam = sayi % 10;
            sayi = sayi / 10;
             if ( rakam % 2 ==0)
            {
             BasamakSayisi++;
             CiftRakamlarToplami = CiftRakamlarToplami + rakam;
            }
             else
            {
              BasamakSayisi++;
              TekRakamlarToplami = TekRakamlarToplami + rakam; 
            } 
          }
        System.out.println("Rakamların toplamı; " + (CiftRakamlarToplami + TekRakamlarToplami));
        System.out.println("Çift rakamlar toplamı: " + CiftRakamlarToplami);
        System.out.println("Tek rakamlar toplamı: " + TekRakamlarToplami);
        System.out.println("Çift rakamlar toplamı ile tek rakamlar toplamının mutlak farkı: " + Math.abs(CiftRakamlarToplami - TekRakamlarToplami));
        System.out.println("Basamak sayısı: " + BasamakSayisi);
           
    }
    
}
