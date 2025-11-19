package vista;

import modelo.Producto;
import java.util.List;
import java.util.Scanner;

public class InventarioVista {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("1. Agregar");
        System.out.println("2. Buscar");
        System.out.println("3. Mostrar");
        System.out.println("4. Eliminar");
        System.out.println("5. Salir");
        return scanner.nextInt();
    }
}
