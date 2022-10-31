import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class App {

     /// 250 - 500 W/h / 157 kW/h / 1000w = 1 kW / 247.5$ x 1 kW/h
     
     public static void main (String [] args) {

          ///Calls
          Scanner newInput = new Scanner(System.in);
          Texto call = new Texto();
          Random numberGen = new Random();

          ///Variables
          int option, paneles = 0, minCapacity = 0, maxCapacity = 0;
          boolean menu1 = false, menu2;

          while (!menu1) {
               try {
                    menu2 = false;

                    call.main_menu();
                    call.option_selection();
                    option = newInput.nextInt();

                    switch (option) {
                         case 1:
                             
                         while (!menu2) {
                              try {

                                   call.solarPanel_options();
                                   call.option_selection();
                                   option = newInput.nextInt();

                                   switch (option) {
                                   case 1:
                                        call.voltage_selector();
                                        option = newInput.nextInt();

                                        switch (option) {
                                             case 1:
                                                  minCapacity = 150;
                                                  maxCapacity = 250;
                                             break;
                                             
                                             case 2:
                                                  minCapacity = 200;
                                                  maxCapacity = 350;
                                             break;

                                             case 3:
                                                  minCapacity = 350;
                                                  maxCapacity = 5000;
                                             break;

                                             default:
                                             System.out.println("Porfavor ingrese solo los numeros indicados");
                                             break;
                                        }
                                        break;

                                   case 2:
                                        System.out.print("\n====# Ingrese el nuevo numero de paneles solares #====\n>\\");
                                        paneles = newInput.nextInt();
                                        break;
                                        
                                   case 3:

                                   case 4:
                                        menu2 = true;
                                        break;

                                   default:
                                   System.out.println("Porfavor ingrese solo los numeros indicados");
                                   break;
                                   }
                              }    catch(InputMismatchException e) {
                                   System.out.println(":v");
                              }
                         }
                                   
                         break;

                         case 2:


                         break;

                         case 3:
                         menu1 = true;
                         break;

                         default: 
                         System.out.println("Porfavor ingrese solo los numeros indicados");
                         break;
                    }

               } catch(InputMismatchException e) {
                    System.out.println(":v");
               }

          }

          newInput.close();
     }
}
