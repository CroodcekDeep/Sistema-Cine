import AbstractDataStructures.DoublyLinkedList;
import Products.Botella;
import Products.Canguil;
import Products.Producto;

import java.util.*;

public class RegistroVenta {

    private DoublyLinkedList<Orden> ordenes = new DoublyLinkedList<Orden>();

    //TODO: The data structure here should be a HashMap instead of an ArrayList
    private static HashMap<Integer, Orden> historialRegistro = new HashMap<>();


    //TODO: The access methods like setters and getters should be implemented based of the Data Structure logic.
    public RegistroVenta(){}

    /***
     * Este método añade un nuevo cliente a la Estructura de clientes
     * @param orden
     */
    public void addOrden(Orden orden){
        this.ordenes.addLast(orden);
    }

    /***
     * Este metodo retorna la lista de clientes.
     * @return
     */
    public DoublyLinkedList<Orden> getOrdenes(){
        return this.ordenes;
    }

    /***
     *
     * @param flag string a ser buscado
     * @return returna un objeto del tipo cliente con todos los datos.
     */
    // TODO: Optimizar a nivel de codigo el metodo searchByName
    public Cliente searchByName(String flag){
        Cliente  c = new Cliente();

        for(int i=0; i<ordenes.size(); i++){ // Ni del primero ni del ultimo
            System.out.println("Iteracion: "+ i);

            if(i==0){
                if (this.ordenes.getData(i).getCliente().getNombres() == flag) {
                    c = this.ordenes.getData(i).getCliente();
                    break;
                }

                if(this.ordenes.getNode(i).getNext().getData().getCliente().getNombres() == flag){
                    c = this.ordenes.getNode(i).getNext().getData().getCliente();
                    break;
                }
            }
            if(i==ordenes.size()-1){
                if (this.ordenes.getData(i).getCliente().getNombres() == flag) {
                    c = this.ordenes.getData(i).getCliente();
                    break;
                }
                if(this.ordenes.getNode(i).getPrev().getData().getCliente().getNombres() == flag){
                    c = this.ordenes.getNode(i).getPrev().getData().getCliente();
                    break;
                }
            }

            if(i!=0 && i!=ordenes.size()-1) {
                if(this.ordenes.getData(i).getCliente().getNombres() == flag) {
                    c = this.ordenes.getData(i).getCliente();
                    break;
                }
                if(this.ordenes.getNode(i).getNext().getData().getCliente().getNombres() == flag ){
                    c = this.ordenes.getNode(i).getNext().getData().getCliente();
                    break;
                }
                if(this.ordenes.getNode(i).getPrev().getData().getCliente().getNombres() == flag){
                    c = this.ordenes.getNode(i).getPrev().getData().getCliente();
                    break;
                }

            }
        }
        return c;
    }
    // TODO: Implementar los metodos searchBy(variables de instacia de la clase Cliente)


    public static void main(String arg[]){

        // 1. Se instancia la main Class Registro Cliente.
        RegistroVenta venta = new RegistroVenta();

        // 2. Ingresa un empleado.
        Empleado empleadoTest = new Empleado(1021, "Maria", "Gutierrez", "1316812104", "Av24", "09829120");
        // 3. Registro una Orden.
        // 3.1 Se registe un Cliente.


        Cliente c1 = new Cliente("Carlos", "Mendoza", "1316812104", "Av 5", "0987868186");
            // Registramos su Orden.

            Orden ordenC1 = new Orden(empleadoTest.getId()+1,c1);
            ArrayList<Producto> productosC1 = new ArrayList<Producto>();
                Botella b = new Botella("Cocacola1",24.2, "Large", "Fresa" );
                Canguil c = new Canguil();
                c.setTamanio("Grande");
                productosC1.add(b);
                productosC1.add(c);
            ordenC1.setProductos(productosC1);

        Cliente C2 = new Cliente("Carla", "Mendoza", "1316812104", "Av 5", "0987868186");
        Orden ordenC2 = new Orden(empleadoTest.getId()+1,C2);
        ArrayList<Producto> productosC2 = new ArrayList<Producto>();
        Botella b2 = new Botella("Cocacola2",24.2, "Large", "Fresa" );
        Canguil c2 = new Canguil();
        c2.setTamanio("Grande");
        productosC2.add(b2);
        productosC2.add(c2);
        ordenC2.setProductos(productosC2);

        Cliente C3 = new Cliente("Luca", "Mendoza", "1316812104", "Av 5", "0987868186");
        Orden ordenC3 = new Orden(empleadoTest.getId()+1,C3);
        ArrayList<Producto> productosC3 = new ArrayList<Producto>();
        Botella b3 = new Botella("Cocacola3",24.2, "Large", "Fresa" );
        Canguil c3 = new Canguil();
        c3.setTamanio("Grande");
        productosC3.add(b3);
        productosC3.add(c3);
        ordenC3.setProductos(productosC3);


        venta.addOrden(ordenC1);
        venta.addOrden(ordenC2);
        venta.addOrden(ordenC3);
        venta.getOrdenes().show();
//        System.out.println(venta.searchByName("Carlos"));






    }
}
