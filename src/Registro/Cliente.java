package Registro;

public class Cliente {
    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String telf;


    public Cliente(){

    }
    public Cliente(String n, String a, String c, String d, String t){
        this.nombres = n;
        this.apellidos = a;
        this.cedula = c;
        this.direccion = d;
        this.telf = t;

    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }


    public String toString(){
        return " Nombres: " + getNombres() + " \n " +
                "Apellidos: " + getApellidos() + " \n " +
                "Cedula: " + getCedula() + " \n " +
                "Direccion: " + getDireccion() + " \n " +
                "Telf: " + getTelf() + " \n " ;
    }
}
