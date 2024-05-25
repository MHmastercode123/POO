public class vehiculo {
    
    private String marca;
    private String modelo;
    private int año;
    private int kilometro;

    public vehiculo(String marca,String modelo ,int año ,int kilometro){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometro = kilometro;     
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public  int getKilometro() {
        return kilometro;
    }
    public void setKilometro(int kilometro) {
        this.kilometro = kilometro;
    }


    public void mostrarInfo(){
        System.out.println("la marca es: "+marca);
        System.out.println("el modelo es: "+modelo);
        System.out.println("el año es: "+año);
        System.out.println("el kilometraje es: "+kilometro);
        
    }
}
