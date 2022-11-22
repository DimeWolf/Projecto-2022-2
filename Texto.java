public class Texto {

     public void option_selection() {
          System.out.print("\n========# Escoja una opcion #=======\n>\\");
     }

     public void voltage_selector() {
          System.out.print("\n=======# Seleccione la capacidad de produccion del panel solar #=======\n1. Baja = 150W/h - 250W/h // 2. Media = 200W/h - 350W/h // 3. Alta = 300W/h - 500W/h\n>\\");
     }

     public void main_menu() {
          System.out.print("\n===========# Menu Principal #===========\n1. Administar paneles solares\n2. Ingresar el consumo del hogar\n3. Calcular ahorro\n4. Salir");
     }


     public void solarPanel_options() {
          System.out.print("\n=======# Paneles solares #=======\n1. Cambiar la capacidad del panel solar\n2. Cambiar el numero de paneles solares\n3. Calcular la produccion de energia por dia\n4. Volver");
     }

     public void missinput_message() {
          System.out.println("Porfavor ingrese solo los numeros indicados");
     }

}