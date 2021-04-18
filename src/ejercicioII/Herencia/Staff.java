package ejercicioII.Herencia;

public class Staff extends Persona{
    private float salarioMensual;
    private String turno;

    public Staff() {
    }

    public Staff(long DNI, String nombre, String apellido, String email, String direccion) {
        super(DNI, nombre, apellido, email, direccion);
    }

    public Staff(long DNI, String nombre, String apellido, String email, String direccion,
                 float salarioMensual, String turno) {
        super(DNI, nombre, apellido, email, direccion);
        this.salarioMensual = salarioMensual;
        this.turno = turno;
    }

    public float getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(float salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float salarioAnual(){
        return salarioMensual*12;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString())
                .append("salario mensual: $").append(salarioMensual)
                .append("salario anual: $").append(salarioAnual())
                .append("turno: ").append(turno)
                .toString();
    }
}
