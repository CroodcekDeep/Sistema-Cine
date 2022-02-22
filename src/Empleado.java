public class Empleado{
    private int id;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String telf;

    public Empleado(){

    }
    public Empleado(int id,String n,  String a, String c, String d, String t){
        this.id = id;
        this.nombres = n;
        this.apellidos = a;
        this.cedula = c;
        this.direccion = d;
        this.telf = t;
    }

    /* Getters */
    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelf() {
        return telf;
    }

    /* Setters */
    public void setId(int id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }
}
