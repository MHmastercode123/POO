public class Auto extends vehiculoPasajero {

private String tipoCombustible;


    public Auto(String marca , String modelo , int año , int kilometros, int numdePasajeros,String mantenimiento,
    String tipoCombustible){

        super(marca, modelo, año, kilometros, mantenimiento, numdePasajeros);
        this.tipoCombustible = tipoCombustible;

    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
    
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double calcularCostoDeMantenimiento(double costototal ){
        double costoxKm = 1.25 ; 
    
        int kilometrosRecorridos = super.getKilometro();

        costototal = costoxKm * kilometrosRecorridos;
     
        System.out.println("el mantenimiento del auto por kilometraje es de : $"+costototal);
      
        return costototal;
    }



    @Override
    public void mostrarInfo(){
    
        super.mostrarInfo();
    
        calcularCostoDeMantenimiento(0);
    
        System.out.println("el tipo decombustible es : "+tipoCombustible);
    }

}
