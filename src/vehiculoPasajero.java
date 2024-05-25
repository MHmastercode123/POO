public class vehiculoPasajero extends realizarMantenimiento{

    private int numdePasajeros;
    public vehiculoPasajero(String marca , String modelo , int año , int kilometros,String mantenimiento, int numdePasajeros){

       super(marca, modelo, año, kilometros, mantenimiento);
        this.numdePasajeros = numdePasajeros;

    }

    public int getNumdePasajeros() {
        return numdePasajeros;
    }
    
    public void setNumdePasajeros(int numdePasajeros) {
        this.numdePasajeros = numdePasajeros;
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("el numero de pasajeros es: "+numdePasajeros);
    }
}
