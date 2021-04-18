package ejercicioI.Herencia;
/*El Cilindro a diferencia del Círculo posee
        un atributo altura, que también se inicializa en 1.0 cuando no le pasamos un valor a
        su constructor. Y un método para calcular el volumen.*/

import ejercicioI.Herencia.Circulo;

public class Cilindro extends Circulo {
    private Double altura = 1.0;

    public Cilindro() {
    }

    public Cilindro(Double altura) {
        this.altura = altura;
    }

    public Cilindro(Double radio, String color, Double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public Double calcularVolumen(Double r, Double altura){
       Double volumen= Math.PI*(r*r)*altura;
       return volumen;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /*Modificar el método toString() de la clase cilindro para que imprima por
    pantalla lo siguiente
    Cilindro: subclase de + {toString() de Círculo} +altura= {alturaCilindro};*/
    @Override
    public String toString() {
        return "Cilindro: subclase de " + super.toString() +
                "altura= " + this.altura;
    }

    /* Sobreescribir el método calcular area declarado en Círculo, para que nos
    permita calcular el área del cilindro.*/
    @Override
    public double calcularArea(double radio) {
        double area = 2 * Math.PI * radio * (this.altura + radio);
        return area;
    }
}
