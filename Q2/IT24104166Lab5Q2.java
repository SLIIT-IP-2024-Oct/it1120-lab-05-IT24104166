import java.util.Scanner;
public class IT24104166Lab5Q1{
   public static void main(String[] args){
   
   System.out.println("Enter the number of new members introduced ");
   int members = Scanner.nextInt();

   if(members<0){
     System.out.println("Invalid input.Number of members cannot be less than 0.");
     }else {
     String prize;
     switch (members) {
       case 0:
         Prize="No Prize";
         break;
       case 1:
         Prize="Pen";
         break;
       case 2:
         Prize="Umbrella";
         break;
       case 3:
         Prize="Bag";
         break;
       case 0:
         Prize="Travelling Chair";
         break;
       default:
         Prize="Head phone";
         break;
       }
      System.out.println("The prize is: "+prize); 
       }
     }
}
