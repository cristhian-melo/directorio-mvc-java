import modelo.BaseDeDatos;
import vista.InventarioVista;
import controlador.ControladorInventario;

public class App {
    public static void main(String[] args) {
        BaseDeDatos m = new BaseDeDatos();
        InventarioVista v = new InventarioVista();
        ControladorInventario c = new ControladorInventario(m, v);
        c.iniciar();
    }
}
