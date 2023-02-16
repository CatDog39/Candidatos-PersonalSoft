package Entidades;

public class Empleado extends Persona implements Aumento {
    private String cargo;
    private int experiencia;

    public Empleado(){

    }


    public Empleado(int tipoDocumento, String numeroDocumento, String primerNombre, String segundoNombre,
                    String primerApellido, String segundoApellido, String telefono, String direccion, int edad) {
        super(tipoDocumento, numeroDocumento, primerApellido, segundoNombre, primerApellido, segundoApellido, telefono, direccion, edad);
    }

    public Empleado(int tipoDocumento, String numeroDocumento, String primerNombre, String segundoNombre,
                    String primerApellido, String segundoApellido, String telefono, String direccion, int edad, String cargo, int experiencia) {
        super(tipoDocumento, numeroDocumento, primerApellido, segundoNombre, primerApellido, segundoApellido, telefono, direccion, edad);
        this.cargo = cargo;
        this.experiencia = experiencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public int generarExperiencia(boolean edad, int valor) {
        int experienciaFinal = 0;

        if (edad && (valor % 2 == 0)) {
            this.setExperiencia(valor + 2);  //evalua par
        } else {
            this.setExperiencia(valor + 1);  //evalua impar
        }
        return experienciaFinal;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Tipo de documento: " + this.getTipoDocumento());
        System.out.println("Numero de documento: " + this.getNumeroDocumento());
        System.out.println("Primer nombre: " + this.getPrimerNombre());
        System.out.println("Segundo nombre: " + this.getSegundoNombre());
        System.out.println("Primer apellido: " + this.getPrimerApellido());
        System.out.println("Segundo apellido: " + this.getSegundoApellido());
        System.out.println("Telefono: " + this.getTelefono());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Experiencia: " + this.getExperiencia());
    }

}
