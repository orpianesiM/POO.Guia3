package ejercicioI;

import ejercicioI.Herencia.Cilindro;

public class Main {

    public static void main(String[] args) {

       /*System.out.println("=====CIRCULO TESTS=====");
        Scanner reader = new Scanner(System.in);
        Circulo circuloDefault = new Circulo();
        Circulo circulo = new Circulo(5.0, "Amarillo");

        System.out.println("Circulo por default" + circuloDefault.toString());
        System.out.println("Circulo valores agregados" + circulo.toString());

        System.out.println("=====CALCULAR AREA=====");
        System.out.println("Ingrese el valor del radio del circulo: ");
        double radio = reader.nextDouble();
        double area = circulo.calcularArea(radio);
        System.out.println("Area del circulo: " + area + "\n");*/

        System.out.println("=====CILINDRO TESTS1=====");
         /*Inicializar un Cilindro y debuguear analizando los constructores a los que va
        llamando para inicializar la cadena de herencia. Imprimir por pantalla, el
        radio del cilindro, la altura, el área de la base y el volumen*/
        Cilindro cilindrito = new Cilindro();
        System.out.println("Cilindrito Default = " + cilindrito.toString());

        System.out.println("=====CILINDRO TESTS2=====");
        /*Inicializar un segundo CIlindro esta vez especificando la altura y radio.
        Imprimir por pantalla el radio, la altura, el área de la base y el volumen.*/
        Cilindro cilindro = new Cilindro(2.0, "Blanco", 4.0);
        System.out.println("***Caracteristicas***");
        System.out.println(cilindro.toString());
        double areaCilindro = cilindro.calcularArea(cilindro.getRadio());
        System.out.println("area : " + areaCilindro);
        double volumenCilindro = cilindro.calcularVolumen(cilindro.getRadio(), cilindro.getAltura());
        System.out.println("volumen : " + volumenCilindro);
        System.out.println("color: " + cilindro.getColor());

        System.out.println("=====CILINDRO TESTS3=====");
        /*Imprimir por pantalla el área y el volumen del cilindro.*/
        /*Vamos a notar que el cálculo del volumen difiere, esto es porque nosotros sobreescribimos el método
        calcular area y ahora nos calcula el área de un cilindro ??????????*/
        System.out.println("Volumen: " + cilindro.calcularVolumen(cilindro.getRadio(), cilindro.getAltura()));
        System.out.println("Area: " + cilindro.calcularArea(cilindro.getRadio()));

        System.out.println("=====CILINDRO TESTS4=====");
        System.out.println(cilindro.toString());

    }
}
