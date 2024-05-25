public class realizarMantenimiento extends vehiculo {

private String mantenimiento;

    public realizarMantenimiento(String marca,String modelo ,int año ,int kilometro , String mantenimiento){

        super(marca, modelo, año, kilometro);
        this.mantenimiento = mantenimiento;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }
    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("el mantenimiento fue el siguiente");
        System.out.println("se realizo  "+mantenimiento);
    }
}
