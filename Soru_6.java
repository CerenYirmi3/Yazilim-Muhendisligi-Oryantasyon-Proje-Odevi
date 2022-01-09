package soru_6;
import java.util.Scanner;
public class Soru_6
{
    public static void main(String[] args) 
    {
       Scanner klavye = new Scanner(System.in);
       System.out.println("Lütfen istenilen yüksekliği giriniz");
       int yukseklik = klavye.nextInt();
       int satir = 1;
        for(int i = 0; i <= yukseklik; i++ )
        {
            for(int j = 0; j <= (yukseklik - satir); j++ )
            {
                System.out.print(" ");
            }
            for(int k = 0; k < satir*2-1; k++)
            {
                System.out.print("*");
            }
            satir++;
            System.out.println("");
        }
    }
    
}