package ejercicioIII.Herencia;

abstract public class FiguraTipo {

    /**********************ATRIBUTOS**********************/
    protected String color;
    protected Boolean coloreado;

    public FiguraTipo(String color, Boolean coloreado) {
        this.color = color;
        this.coloreado = coloreado;
    }

    /**********************GETTERS AND SETTERS**********************/
    abstract public String getColor();
    abstract void setColor();
    abstract Boolean getColoreado();
    abstract public void setColoreado(Boolean coloreado);

    /**********************METODOS**********************/
    abstract public double calcularArea();
    abstract public double calcularPerimetro();


    @Override
    public String toString() {
        return "color= " + color + "\n" +
                "coloreado= " + coloreado;
    }
}
