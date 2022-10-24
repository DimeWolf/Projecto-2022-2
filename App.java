import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
     
     public static void main (String [] args) {

          Scanner newInput = new Scanner(System.in);
          Texto call = new Texto();
          
          int option;
          boolean menu1  = false;

          while (!menu1) {

               try {

                    call.main_menu();
                    call.option_selection();

                    option = newInput.nextInt();

                    switch (option) {
                         
                         case 1:

                         System.out.println("Nada");
                         break;

                         case 2:

                         System.out.println("Nada, otra vez");
                         break;

                         case 3:

                         System.out.println("Chao concha e su mare");
                         menu1 = true;
                         break;

                         default: 

                         System.out.println("Cachon era tres numeros");
                         break;
                    }

               } catch(InputMismatchException e) {
                    System.out.println(":v");
               }

          }

          newInput.close();
     }
}