package ejercicioIII.Herencia;

public class Rectangulo extends FiguraTipo{
    protected String color;
    protected Boolean coloreado = false;
    private double alto;
    private double ancho;

    public Rectangulo(String color, Boolean coloreado) {
        super(color, coloreado);
    }

    public Rectangulo(String color, Boolean coloreado, double alto, double ancho) {
        super(color, coloreado);
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
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
        return this.alto*2+this.ancho*2;
    }

    @Override
    public double calcularPerimetro() {
        return this.alto*this.ancho;
    }

    @Override
    public String toString() {
        return super.toString() +  "\n" +
                "alto= " + alto +  "\n" +
                "ancho=" + ancho + "\n" +
                "area= " + calcularArea() + "\n" +
                "perimetro= " + calcularPerimetro()
                + "\n" ;
    }

}
