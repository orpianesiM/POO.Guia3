package ejercicioI.Herencia;

/*Clase Círculo, que posee un radio cuyo valor por defecto al ser inicializado
sin valores es 1.0. Además el tipo Círculo posee un atributo color, por defecto rojo,
un método para calcular el área y otro para imprimir sus características.*/

public class Circulo {
    protected Double radio = 1.0;
    protected String color = "Rojo";


    public Circulo() {

    }

    public Circulo(Double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea(double radio){
       double area = Math.round(Math.PI * Math.pow(radio, 2));
       return area;
    }

    @Override
    public String toString() {
        return "Circulo: " +"\n" +
                "radio=" + radio + "\n" +
                "color='" + color + "\n" ;
    }

}
