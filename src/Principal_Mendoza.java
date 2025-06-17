//Version defitiva revisada
//Autor Luis Mendoza
//Versión 1.0

public class Principal_Mendoza {
    // Constantes 
    private static final int MULTIPLICADOR_PERIMETRO = 2;  // El 2 de las fórmulas de perímetro (siempre es 2, no cambia)
    private static final double RADIO_CIRCULO = 5.0;       // Radio del círculo 
    private static final double LADO_A_RECTANGULO = 4.0;   // Un lado del rectángulo
    private static final double LADO_B_RECTANGULO = 6.0;    // El otro lado del rectángulo

    public static void main(String[] args) {
        // 1. Crear las figuras 
        Mendoza_circulo circulo1 = new Mendoza_circulo(
            1,                           // ID
            "Círculo Solar",             // Nombre
            RADIO_CIRCULO,               // Radio (5.0)
            "Amarillo"                   // Color 
        );
        
        Mendoza_rectangulo rectangulo1 = new Mendoza_rectangulo(
            1,                           // ID
            LADO_A_RECTANGULO,            // Lado A = 4.0
            LADO_B_RECTANGULO,            // Lado B = 6.0
            "Verde"                       // Color
        );

        // 2. Calcular perímetros 
        double perimetroCirculo = calcularPerimetroCirculo(circulo1.getRadio());      // Le mando el radio del círculo
        double perimetroRectangulo = calcularPerimetroRectangulo(rectangulo1.getLadoA(), rectangulo1.getLadoB());  // Le mando los lados

        // 3. Mostrar resultados
        System.out.println("\n=== PERÍMETROS ===");
        System.out.printf("Perímetro del %s: %.2f%n", circulo1.getNombre(), perimetroCirculo);          // El %.2f para decimales
        System.out.printf("Perímetro del rectángulo %s: %.2f%n", rectangulo1.getColor(), perimetroRectangulo);  // Lo mismo aquí para el rectangulo
    }

    /**
     * Método para calcular el perímetro del círculo (la circunferencia).
     * @param radio Lo que mide de radio el círculo.
     * @return El perímetro (2 * π * radio) pero usando la constante MULTIPLICADOR_PERIMETRO.
     */
    private static double calcularPerimetroCirculo(double radio) {
        return MULTIPLICADOR_PERIMETRO * Math.PI * radio;  // Formula del permetro del circulo.
    }

    /**
     * Método para calcular el perímetro del rectángulo.
     * @param ladoA Uno de los lados.
     * @param ladoB El otro lado.
     * @return El perímetro (2*(ladoA + ladoB)) otra vez con la constante.
     */
    private static double calcularPerimetroRectangulo(double ladoA, double ladoB) {
        return MULTIPLICADOR_PERIMETRO * (ladoA + ladoB);  // Formula de calculo del Rectangulo
    }
}