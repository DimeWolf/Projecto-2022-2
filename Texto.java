public class Texto {
     
     ///Sip, esta clase es lo que parece, es para guardar todo el texto y menus en clases distintas que se puedan llamar multiples veces, en ves de repetirlo 1000 veces en la main class


     public void option_selection() {
          System.out.print("\n========# Seleccione una opcion #=======\n>\\");
     }

     public void voltage_selector() {
          System.out.print("\n=======# Seleccione la capacidad de produccion del panel solar #=======\n1. Baja = 150Wh - 250Wh // 2. Media = 200Wh - 350Wh // 3. Alta = 300Wh - 500Wh\n>\\");
     }

     public void main_menu() {
          System.out.print("\n===========# Menu Principal #===========\n1. Opciones del panel solar\n2.\n3. Salir");
     }

     public void solarPanel_options() {
          System.out.print("\n=======# Paneles solares #=======\n1. Cambiar la capacidad del panel solar\n2. Cambiar el numero de paneles solares\n3. Calcular la produccion por dia\n4. Volver");
     }


}
