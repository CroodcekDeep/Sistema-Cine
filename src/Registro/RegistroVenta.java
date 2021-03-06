package Registro;

import AbstractDataStructures.DoublyLinkedList;

import java.util.*;

public class RegistroVenta {
    private DoublyLinkedList<Orden> ordenes = new DoublyLinkedList<Orden>();
    private HashMap<Integer, Factura> historialRegistro = new HashMap<>();

    public RegistroVenta() {
    }

    /***
     * Este método añade un nuevo cliente a la Estructura de clientes
     * @param orden
     */
    public void addOrden(Orden orden) {
        this.ordenes.addLast(orden);
    }

    public HashMap<Integer, Factura> getHistorialRegistro() {
        return historialRegistro;
    }

    public void setHistorialRegistro(HashMap<Integer, Factura> historialRegistro) {
        this.historialRegistro = historialRegistro;
    }

    /***
     * Este método retorna la lista de clientes.
     * @return
     */
    public DoublyLinkedList<Orden> getOrdenes() {
        return this.ordenes;
    }

    /***
     *
     * @param flag string a ser buscado
     * @return retorna un objeto del tipo cliente con todos los datos.
     */
    // TODO: Optimizar a nivel de código el método searchByName
    public Cliente searchByNameClient(String flag) {
        Cliente c = new Cliente();

        for (int i = 0; i < ordenes.size(); i++) { // Ni del primero ni del ultimo
            System.out.println("Iteracion: " + i);

            if (i == 0) {
                if (this.ordenes.getData(i).getCliente().getNombres() == flag) {
                    c = this.ordenes.getData(i).getCliente();
                    break;
                }

                if (this.ordenes.getNode(i).getNext().getData().getCliente().getNombres() == flag) {
                    c = this.ordenes.getNode(i).getNext().getData().getCliente();
                    break;
                }
            }
            if (i == ordenes.size() - 1) {
                if (this.ordenes.getData(i).getCliente().getNombres() == flag) {
                    c = this.ordenes.getData(i).getCliente();
                    break;
                }
                if (this.ordenes.getNode(i).getPrev().getData().getCliente().getNombres() == flag) {
                    c = this.ordenes.getNode(i).getPrev().getData().getCliente();
                    break;
                }
            }

            if (i != 0 && i != ordenes.size() - 1) {
                if (this.ordenes.getData(i).getCliente().getNombres() == flag) {
                    c = this.ordenes.getData(i).getCliente();
                    break;
                }
                if (this.ordenes.getNode(i).getNext().getData().getCliente().getNombres() == flag) {
                    c = this.ordenes.getNode(i).getNext().getData().getCliente();
                    break;
                }
                if (this.ordenes.getNode(i).getPrev().getData().getCliente().getNombres() == flag) {
                    c = this.ordenes.getNode(i).getPrev().getData().getCliente();
                    break;
                }
            }
        }
        return c;
    }
    // TODO: Implementar los métodos searchBy(variables de instancia de la clase Registro.Cliente)

}