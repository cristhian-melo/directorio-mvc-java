package controlador;

import modelo.BaseDeDatos;
import vista.InventarioVista;

public class ControladorInventario {
    private BaseDeDatos baseDatos;
    private InventarioVista vista;

    public ControladorInventario(BaseDeDatos m, InventarioVista v) {
        this.baseDatos = m;
        this.vista = v;
    }

    public void iniciar() {
        System.out.println("App lista (demo)");
    }
}
