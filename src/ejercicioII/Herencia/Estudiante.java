package ejercicioII.Herencia;

public class Estudiante extends Persona{
    private int añoIngreso;
    private float cuotaMensual;
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(long DNI, String nombre, String apellido, String email, String direccion) {
        super(DNI, nombre, apellido, email, direccion);
    }

    public Estudiante(long DNI, String nombre, String apellido, String email, String direccion,
                      int añoIngreso, float cuotaMensual, String carrera) {
        super(DNI, nombre, apellido, email, direccion);
        this.añoIngreso = añoIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public float getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(float cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() +
                "carrera: " + carrera +
                "año ingreso: " + añoIngreso +
                "cuota mensual: $" + cuotaMensual;
    }
}
