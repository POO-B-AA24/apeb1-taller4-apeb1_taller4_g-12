package ListaEmpleados;

import java.util.Scanner;
import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        int opcion;

        do {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar información de empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = siu.nextInt();

            switch (opcion) {
                case 1:
                    Empleado.agregarEmpleado(siu, empleados);
                    break;
                case 2:
                    Empleado.mostrarInformacionEmpleados(empleados);
                    break;
                case 3:
                    Empleado.calcularAumentoSalario(siu, empleados);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 4);

        siu.close();
    }
}