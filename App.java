import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
     
     public static void main (String [] args) {

          ///Calls
          Scanner newInput = new Scanner(System.in);
          Texto call = new Texto();

          ///Variables
          int option, panels = 0, minCapacity = 0, maxCapacity = 0, consumoHogar = 0;
          boolean menu1 = false, menu2;
          double kW = 0, kWh = 0, kWhTotal = 0, valorParcial, valorFinal = 0, precioKwh = 799.0;

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
                                                  maxCapacity = 500;
                                             break;

                                             default:
                                                  call.missinput_message();
                                             break;
                                        }
                                   break;

                                   case 2:
                                        System.out.print("\n====# Ingrese el nuevo numero de paneles solares #====\n>\\");
                                        panels = newInput.nextInt();
                                        break;
                                        
                                   case 3:
                                        kW = Math.floor(Math.random() * (maxCapacity - minCapacity + 1)) + minCapacity;
                                        kWh = kW * panels / 1000;
                                        kWhTotal = kWh * 8;

                                        System.out.print("\nNumero de paneles solares = " + panels + "\nVatios producidos por panel = " + kW + " W\nKilovatios producidos por hora = " + kWh + " Kw/h\nKilowatts producidos por dia = " + kWhTotal + " kW/h\n");
                                   break;

                                   case 4:
                                        menu2 = true;
                                   break;

                                   default:
                                        call.missinput_message();
                                   break;
                                   }
                              }    catch(InputMismatchException e) {
                                   System.out.println(":v");
                              }
                         }
                                   
                         break;

                         case 2:
                              System.out.print("\n===# Ingrese el consumo de kilovatios de su hogar #===\n>\\");
                              consumoHogar = newInput.nextInt();
                         break;

                         case 3:
                              valorParcial = kWh * precioKwh;
                              valorFinal = Math.round(valorParcial * 100d) / 100d;
                              System.out.print("\nTeniendo un consumo total de " + consumoHogar + " kW por hora\nY produciendo con " + panels + " paneles solares " + kWh + " kW por hora\nEn total usted ahorraria " + valorFinal + " pesos por hora\n");
                         break;

                         case 4:
                              menu1 = true;
                         break;

                         default: 
                              call.missinput_message();
                         break;
                    }
               } catch(InputMismatchException e) {
                    System.out.println(":v");
               }
          }
          newInput.close();
     }
}