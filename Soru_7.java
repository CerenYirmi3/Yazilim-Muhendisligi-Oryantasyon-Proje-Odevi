package soru_7;
public class Soru_7 
{
    public static void main(String[] args) 
    { 
       int a,b ;
       boolean d;
       for(a = 2; a <= 50; a++)
       {
           d = true;
           for(b = 2; b < a ; b++)
           {
              if (a % b == 0 )
              {
                  d = false;
                  break;
              }  
              
           }
           
           if( d == true )
           {
               System.out.print(a + ", ");
           }  
       }
    }
    
}