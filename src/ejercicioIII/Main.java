package ejercicioIII;

import ejercicioIII.Herencia.*;
import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        FiguraTipo[] figura = new FiguraTipo[5];
        figura[0] = new Circulo("Rosa", true, 5.0);
        figura[1] = new Circulo("Rojo", false, 8.5);
        figura[2] = new Rectangulo("Azul", false, 2.0, 4.2);
        figura[3] = new Rectangulo("Blanco", true, 6.2, 4.0);


        for (FiguraTipo figuraTipo : figura) {
            if (figuraTipo instanceof Circulo) {
                System.out.println("Circulo: \n" + figuraTipo.toString());
            } else if (figuraTipo instanceof Rectangulo){
                System.out.println("Rectangulo: \n" + figuraTipo.toString());
            }
        }

    }
}
