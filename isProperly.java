import java.util.Scanner;

public class myprogram {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         String sequence = scanner.next();

         isProperly(sequence);
    }

  public static  boolean isProperly(String sequence){
         int m=0;

         for(int k=0;k<sequence.length();k++){
             if(sequence.charAt(k)=='(')
                 m++;
             if(sequence.charAt(k)==')')
                 m--;
         }
         if(m==0){
             System.out.println("yes");
             return true;
         }
         else{
             System.out.println("no");
             return false;
         }

  }

}
