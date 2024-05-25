/* nombre : Rony Gustavo Molina Hernandez
 * carnet : 2024 - 1679U
 */



public class App {

    public static void main(String[] args) {
        
    Auto auto = new Auto("nissan", "frontier", 2020,3545, 4, "limpieza de carroceria", "diesel");
    
    Camion camion = new Camion("CAT", "oruga", 1990,7000,5000, "cambio de llantas delanteras", 4);
   
    System.out.println("informacion del auto");

    auto.mostrarInfo();
   
    System.out.println("-------------------------------------------------------");

    System.out.println("informacion del camion");
   
    camion.mostrarInfo();
    }
}
