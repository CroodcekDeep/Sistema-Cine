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
     * Este método añade un nuevo cliente a la Estructura de clientes
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

    /***
     *
     * @param flag string a ser buscado
     * @return returna un objeto del tipo cliente con todos los datos.
     */
    // TODO: Optimizar a nivel de codigo el metodo searchByName
    public Cliente searchByName(String flag){
        Cliente c = new Cliente();

        for(int i=0; i<clientes.size(); i++){ // Ni del primero ni del ultimo
            System.out.println("Iteracion: "+ i);

            if(i==0){
                if (this.clientes.getData(i).getNombres() == flag) {
                    c = this.clientes.getData(i);
                    break;
                }

                if(this.clientes.getNode(i).getNext().getData().getNombres() == flag){
                    c = this.clientes.getNode(i).getNext().getData();
                    break;
                }
            }
            if(i==clientes.size()-1){
                if (this.clientes.getData(i).getNombres() == flag) {
                    c = this.clientes.getData(i);
                    break;
                }
                if(this.clientes.getNode(i).getPrev().getData().getNombres() == flag){
                    c = this.clientes.getNode(i).getPrev().getData();
                    break;
                }
            }

            if(i!=0 && i!=clientes.size()-1) {
                if(this.clientes.getData(i).getNombres() == flag) {
                    c = this.clientes.getData(i);
                    break;
                }
                if(this.clientes.getNode(i).getNext().getData().getNombres() == flag ){
                    c = this.clientes.getNode(i).getNext().getData();
                    break;
                }
                if(this.clientes.getNode(i).getPrev().getData().getNombres() == flag){
                    c = this.clientes.getNode(i).getPrev().getData();
                    break;
                }

            }
        }
        return c;
    }
    // TODO: Implementar los metodos searchBy(variables de instacia de la clase Cliente)





    public static void main(String arg[]){
        RegistroVenta test = new RegistroVenta();

        Cliente c1 = new Cliente("Carlos", "Mendoza", "1316812104", "Av 5", "0987868186");
        Cliente c2 = new Cliente("Carla", "Mendoza", "1316812104", "Av 5", "0987868186");
        Cliente c3 = new Cliente("Luca", "Mendoza", "1316812104", "Av 5", "0987868186");

        test.addCliente(c1);
        test.addCliente(c2);
        test.addCliente(c3);

        //test.getClientes().show();
        System.out.println();
//        System.out.println(test.getClientes().getData(2).getNombres());
//        System.out.println(test.getClientes().getNode(2));

        System.out.println(test.searchByName("Luca").toString());


    }
}
