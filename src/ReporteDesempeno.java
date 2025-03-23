public class ReporteDesempeno {
    public static void generarReporte(Empleado empleado) {
        if (empleado == null) {
            System.out.println("El empleado no se encuentra registrado en el sistema.");
            return;
        }
        System.out.println("\n--- Reporte de Desempeño ---");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-15s | %-10s | %-10s |%n", "ID", "Nombre", "Bono", "Desempeño");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("| %-5d | %-15s | %-10.2f | %-10s |%n",
                empleado.getId(), empleado.getNombre(), empleado.calcularBono(), evaluarDesempeno(empleado));
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    private static String evaluarDesempeno(Empleado empleado) {
        if (empleado.calcularBono() > 500) {
            return "Excelente";
        } else if (empleado.calcularBono() > 200) {
            return "Bueno";
        } else {
            return "Regular";
        }
    }
}