package soru_8; 
import java.util.Scanner;
public class Soru_8
{
    public static void main(String[] args)
    {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen istenilen sayı dizisi boyutunu giriniz: ");
        int a = klavye.nextInt();
        double[] SayiDizisi = new double[a];
        double EnBuyukSayi = SayiDizisi[0];
        int BuyukIndeks = 0;
         
        for(int i = 1; i <= a; i++ )
        {
            System.out.print(i + ".sayıyı giriniz: ");
            SayiDizisi[i-1] = klavye.nextDouble();
        } 
         
        for(int j = 0; j < a; j++)
        {
            if(SayiDizisi[j] > EnBuyukSayi)
            {
                EnBuyukSayi = SayiDizisi[j];
                BuyukIndeks = j; 
            }
        }
         System.out.println("Bu dizideki en büyük sayı " + EnBuyukSayi +
        " ve en büyük sayının bulunduğu indeks " + BuyukIndeks + "'dir." );
    } 
} 