package Registro;

public class Cliente {
    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String telf;

    public Cliente() {

    }

    public Cliente(String nombres, String apellidos, String cedula, String direccion, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telf = telefono;
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

    public String toString() {
        return "\nNombres: " + nombres +
                "\nApellidos: " + apellidos +
                "\nCédula: " + cedula +
                "\nDirección: " + direccion +
                "\nTelf: " + telf + " \n";
    }
}
