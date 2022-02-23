import AbstractDataStructures.DoublyLinkedList;

import java.io.*;
import java.util.*;

public class RegistroVenta {

    private DoublyLinkedList<Cliente> clientes = new DoublyLinkedList<Cliente>();


    //TODO: The data structure here should be a HashMap instead of an ArrayList
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();


    //TODO: The access methods like setters and getters should be implemented based of the Data Structure logic.
    public RegistroVenta(){

    }

    /***
     * Este metodo aniade un nuevo cliente a la Estructura de clientes
     * @param cliente
     */
    public void addCliente(Cliente cliente){
        this.clientes.addLast(cliente);
    }

    /***
     * Este metodo retorna la lista de clientes.
     * @return
     */
    public DoublyLinkedList<Cliente> getClientes(){
        return this.clientes;
    }





    public static void main(String arg[]){
        RegistroVenta test = new RegistroVenta();

        Cliente c1 = new Cliente("Carlos", "Mendoza", "1316812104", "Av 5", "0987868186");
        Cliente c2 = new Cliente("Carla", "Mendoza", "1316812104", "Av 5", "0987868186");
        Cliente c3 = new Cliente("Luca", "Mendoza", "1316812104", "Av 5", "0987868186");

        test.addCliente(c1);
        test.addCliente(c2);
        test.addCliente(c3);

        test.getClientes().show();
        System.out.println();
        System.out.println(test.getClientes().get(2).getNombres());



    }
}
