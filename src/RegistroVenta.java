import java.io.*;
import java.util.*;

public class RegistroVenta {

    //TODO: The data structure here should be a DoublyLinkedList instead of an ArrayList
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    //TODO: The data structure here should be a HashMap instead of an ArrayList
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();


    //TODO: The access methods like setters and getters should be implemented based of the Data Structure logic.
    public RegistroVenta(){

    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public static void main(String arg[]){
        RegistroVenta test = new RegistroVenta();
        
        Cliente c1 = new Cliente("Carlos", "Mendoza", "1316812104", "Av 5", "0987868186");
        Cliente c2 = new Cliente("Carla", "Mendoza", "1316812104", "Av 5", "0987868186");
        Cliente c3 = new Cliente("Luca", "Mendoza", "1316812104", "Av 5", "0987868186");

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);
        test.setClientes(listaClientes);

        // Logica de encapsulacion, al final esta dentro de la clase RegistroVenta
        for(int i=0; i<test.getClientes().size(); i++){
            System.out.println(test.getClientes().get(i).getNombres());
        }
    }
}
