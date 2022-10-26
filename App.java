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
          int option, precioKwH = 247, kWh, kWhtotal, consumoProm = 157, ProduccionMax = 500, ProduccionMin = 250, paneles = 1;
          boolean menu1  = false, menu2 = false;

          while (!menu1) {

               try {

                    call.main_menu();
                    call.option_selection();

                    option = newInput.nextInt();

                    switch (option) {
                         
                         case 1:
                         menu2 = false;

                         while (!menu2) {
                              
                              try {

                                   kWh = numberGen.nextInt(ProduccionMax) + ProduccionMin;
                                   kWhtotal = paneles * kWh; 

                                   System.out.print("\n=========#   #=========\n\n- Usted tiene: " + paneles + " paneles solares, generando: " + kWhtotal + "Wh\n\n- El consumo energetico de una casa en colombia es de: " + consumoProm + "kWh costando: " + precioKwH + " pesos");

                                   call.option_selection();

                                   option = newInput.nextInt();

                                   switch (option) {

                                        case 1:

                                        case 2:

                                        menu2 = true;

                                        default:

                                        System.out.println("Porfavor ingrese solo los numeros indicados");
                                        break;
                                   }

                              } catch (InputMismatchException e) {
                                   System.out.println(":v");
                              }
                         }

                         break;

                         case 2:

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