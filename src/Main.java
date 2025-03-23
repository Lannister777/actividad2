import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Departamento dptoTI = new Departamento("Tecnología de la Información");

            System.out.println("Ingrese el número de empleados a registrar:");
            int numEmpleados = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numEmpleados; i++) {
                System.out.println("Ingrese el ID del empleado:");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el nombre del empleado:");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese el tipo de empleado (Permanente/Temporal):");
                String tipo = scanner.nextLine();

                System.out.println("Ingrese el salario del empleado:");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Ingrese la antigüedad en años del empleado:");
                int antiguedad = scanner.nextInt();
                scanner.nextLine();

                Empleado nuevoEmpleado = new Empleado(id, nombre, tipo, salario, antiguedad);
                dptoTI.agregarEmpleado(nuevoEmpleado);

                System.out.println("Empleado agregado exitosamente!");
            }

            dptoTI.listarEmpleados();

            System.out.println("Generando reportes de desempeño...");
            for (Empleado e : dptoTI.getEmpleados()) {
                ReporteDesempeno.generarReporte(e);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
