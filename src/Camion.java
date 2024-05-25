public class Camion extends vehiculoCarga {

    private int numEje;

    public Camion(String marca,String modelo ,int año ,int kilometro, int capacidadCarga,String mantenimiento, int numEje){

        super(marca, modelo, año, kilometro, mantenimiento, capacidadCarga);
        
        this.numEje = numEje;
    }

    public int getNumEje() {
        return numEje;
    }

    public void setNumEje(int numEje) {
        this.numEje = numEje;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        
        System.out.println("el numero de ejes es: "+numEje);
    }
}
