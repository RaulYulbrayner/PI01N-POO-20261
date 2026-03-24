package uniquindio.edu.co.model;

public class Empleado extends Persona {

    private double sueldo;
    private TipoEmpleado tipo;

    public Empleado(String nombre, int cedula, int telefono, double sueldo, TipoEmpleado tipo){
        super(nombre, cedula, telefono);
        this.sueldo = sueldo;
        this.tipo = tipo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "NOMBRE=" + getNombre() + '\n' +
                ", CEDULA=" + getCedula() + '\n' +
                ", TELEFONO=" + getTelefono() + '\n' +
                ", sueldo =" + sueldo + '\n' +
                ", tipo=" + tipo +
                '}';
    }
}
