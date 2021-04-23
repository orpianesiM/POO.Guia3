package ejercicioIII.Herencia;

public class Circulo extends FiguraTipo{
    protected String color;
    protected Boolean coloreado = false;
    private Double radio;

    public Circulo(String color, Boolean coloreado) {
        super(color, coloreado);
    }

    public Circulo(String color, Boolean coloreado, Double radio) {
        super(color, coloreado);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    void setColor() {
        this.color = color;
    }

    @Override
    Boolean getColoreado() {
        return this.coloreado;
    }

    @Override
    public void setColoreado(Boolean coloreado) {
        this.coloreado = coloreado;
    }

    @Override
    public double calcularArea() {
        return Math.round(Math.PI * Math.pow(this.radio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*this.radio*2;
    }

    @Override
    public String toString() {
        return super.toString() +  "\n" +
                "radio=" + radio + "\n" +
                "area= " + calcularArea() + "\n" +
                "perimetro= " + calcularPerimetro()
                + "\n" ;
    }
}
