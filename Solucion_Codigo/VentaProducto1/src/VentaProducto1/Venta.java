package VentaProducto1;
import java.util.Scanner;

public class Venta {
    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = siu.nextDouble();

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = siu.nextInt();

        Productos venta = new Productos(precio, cantidad);
        
        double totalSinDescuento = venta.calcularTotal();
        System.out.println("El total de su compra es de: $" + totalSinDescuento);

        double descuento = venta.calcularDescuento();
        double precioFinal = venta.calcularPrecioFinal();

        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Precio final después del descuento: $" + precioFinal);

        siu.close();
    }
}