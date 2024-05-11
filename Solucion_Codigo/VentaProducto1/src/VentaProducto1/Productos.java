package VentaProducto1;

public class Productos {
    private double precio;
    private int cantidad;

    public Productos(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return precio * cantidad;
    }

    public double calcularDescuento() {
        if (precio >= 1000 && cantidad >= 10) {
            return calcularTotal() * 0.1;
        } else if(precio >= 1000 && cantidad < 10) {
            return calcularTotal() * 0.05; 
        }else{
            return precio;
        }
    }

    public double calcularPrecioFinal() {
        return calcularTotal() - calcularDescuento();
    }
}