package soru_3;
import java.util.Scanner;
public class Soru_3 
{
    public static void main(String[] args) 
    {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen terim sayısını giriniz");
        int TerimSayisi = klavye.nextInt();
        int a= 1;
        int b = 2;
        for(int i = 0; i < TerimSayisi; i++  )
        {
           System.out.print(a + ", ");
           a = a + b;
           b += 1; 
        }        
    }
}