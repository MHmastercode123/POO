public class vehiculoCarga extends realizarMantenimiento{

private int capacidadCarga;

    public vehiculoCarga(String marca,String modelo ,int año ,int kilometro,String mantenimiento,  int capacidadCarga){

        super(marca, modelo, año, kilometro, mantenimiento);
        this.capacidadCarga = capacidadCarga;

    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("la capacidad de carga es de: "+capacidadCarga);
    }
}
