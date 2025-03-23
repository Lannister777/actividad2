public class Empleado {
    private int id;
    private String nombre;
    private String tipo;
    private Departamento departamento;
    private double salario;
    private int antiguedad;

    public Empleado(int id, String nombre, String tipo, double salario, int antiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public void asignarDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public double calcularBono() {
        return salario * (antiguedad * 0.05);
    }

    public String obtenerInfo() {
        return String.format("| %-5d | %-15s | %-10s | %-20s | %-10.2f | %-10d | %-10.2f |",
                id, nombre, tipo, (departamento != null ? departamento.getNombre() : "Sin asignar"), salario, antiguedad, calcularBono());
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}