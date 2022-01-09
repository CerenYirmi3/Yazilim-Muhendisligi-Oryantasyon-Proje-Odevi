package soru_4;
import java.util.Scanner;
class Soru_4
{
  public static void main(String [] args)
  {
      Scanner klavye = new Scanner(System.in);
      System.out.println("Lütfen bir sayı giriniz");
      int sayi = klavye.nextInt();
      String sonuc = ""; 
       if(sayi % 2 == 1 )
      {
          while(sayi != 0)
        {
          int kalan = sayi % 2; 
          sayi = sayi / 2;
          sonuc = kalan + sonuc;
        }        
            System.out.println(sonuc);
      }
       else
       {
             while(sayi != 0)
        {
          int kalan = sayi % 8; 
          sayi = sayi / 8;
          sonuc = kalan + sonuc;
        }     
        System.out.println(sonuc);
       }    
  }
}