package soru_10;
import java.util.Scanner;
public class Soru_10
{
    public static void main(String[] args) 
    {
      Scanner klavye = new Scanner(System.in);  
      int sayi = (int)(Math.random() * 100) + 1;
      System.out.println(sayi);
      System.out.println( "1 ile 100 arasında bir sayı tahmin ediniz: ");
      int tahmin = klavye.nextInt();
      int sayac = 1;
        while(tahmin != sayi )
        { 
         
            if( tahmin > sayi)
            {
              System.out.println("Tahminin yüksek. ");
              sayac++;
            } 
            else 
            {
              System.out.println("Tahminin düşük. ");
              sayac++;                
            }  
            System.out.println( "Tekrar 1 ile 100 arasında bir sayı tahmin ediniz: ");
            tahmin = klavye.nextInt();
        }
       System.out.println("Tebrikler " + sayac + ". tahmininizde doğru bildiniz.");
    }
    
}