package modelo;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) { productos.add(p); }

    public Producto buscarProductoSku(String sku) {
        return productos.stream()
                .filter(p -> p.toString().contains(sku))
                .findFirst()
                .orElse(null);
    }

    public List<Producto> buscarTodos() { return productos; }

    public boolean eliminarProducto(String sku) {
        Producto p = buscarProductoSku(sku);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }