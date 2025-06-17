public class Principal_Mendoza {
    public static void main(String[] args) {
        // 1. Crear instancias de las figuras
        Mendoza_circulo circulo1 = new Mendoza_circulo(1, "Círculo Solar", 5.0, "Amarillo");
        Mendoza_rectangulo rectangulo1 = new Mendoza_rectangulo(1, 4.0, 6.0, "Verde");

        // 2. Calcular y mostrar perímetros
        double perimetroCirculo = calcularPerimetroCirculo(circulo1.getRadio());
        double perimetroRectangulo = calcularPerimetroRectangulo(rectangulo1.getLadoA(), rectangulo1.getLadoB());

        System.out.println("\n=== PERÍMETROS ===");
        System.out.printf("Perímetro del %s: %.2f%n", circulo1.getNombre(), perimetroCirculo);
        System.out.printf("Perímetro del rectángulo %s: %.2f%n", rectangulo1.getColor(), perimetroRectangulo);
    }

    /**
     * Calcula el perímetro de un círculo (circunferencia)
     * @param radio Radio del círculo
     * @return Perímetro calculado (2 * π * radio)
     */
    private static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    /**
     * Calcula el perímetro de un rectángulo
     * @param ladoA Primer lado del rectángulo
     * @param ladoB Segundo lado del rectángulo
     * @return Perímetro calculado (2*(ladoA + ladoB))
     */
    private static double calcularPerimetroRectangulo(double ladoA, double ladoB) {
        return 2 * (ladoA + ladoB);
    }
}