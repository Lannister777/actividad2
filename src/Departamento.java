import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) throws Exception {
        if (empleado == null) {
            throw new Exception("No se ha registrado el empleado en el sistema.");
        }
        empleados.add(empleado);
        empleado.asignarDepartamento(this);
    }

    public void eliminarEmpleado(Empleado empleado) throws Exception {
        if (!empleados.contains(empleado)) {
            throw new Exception("Empleado no encontrado en este departamento");
        }
        empleados.remove(empleado);
        empleado.asignarDepartamento(null);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en el departamento " + nombre);
        } else {
            System.out.println("Empleados en el departamento " + nombre + ":");
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.printf("| %-5s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s |%n",
                    "ID", "Nombre", "Tipo", "Departamento", "Salario", "Antigüedad", "Bono");
            System.out.println("--------------------------------------------------------------------------------------------");
            for (Empleado e : empleados) {
                System.out.println(e.obtenerInfo());
            }
            System.out.println("--------------------------------------------------------------------------------------------");
        }
    }
}