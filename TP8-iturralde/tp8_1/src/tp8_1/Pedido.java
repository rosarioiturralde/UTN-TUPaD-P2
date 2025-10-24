/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void cambiarEstado(String estado) {
        cliente.notificar("El estado del pedido cambió a: " + estado);
    }

    @Override
    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}

