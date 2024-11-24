import java.util.Scanner;
public class IT24104166Lab5Q1{
   public static void main(String[] args){
   
   System.out.println("Enter the first integer ");
   int num1 = Scanner.nextInt();

   System.out.println("Enter the second integer ");
   int num2 = Scanner.nextInt();

   System.out.println("Enter the third integer ");
   int num3 = Scanner.nextInt();

   int largest =Math.max(num1, Math.max(num2,num3));
   int smallest= Math.min(num2, Math.min(num2,num3));

   System.out.println("The largest number is "+largest);
   System.out.println("The smallest number is "+smallest);
   }
}
