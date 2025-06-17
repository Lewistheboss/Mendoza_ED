public class Principal_Mendoza {
    public static void main(String[] args) {
        // 1. Crear instancias de las figuras
        Mendoza_circulo circulo1 = new Mendoza_circulo(1, "Círculo Solar", 5.0, "Amarillo");
        Mendoza_circulo circulo2 = new Mendoza_circulo("Círculo Lunar", 3.0, "Plateado");
        
        Mendoza_rectangulo rectangulo1 = new Mendoza_rectangulo(1, 4.0, 6.0, "Verde");
        Mendoza_rectangulo cuadrado1 = new Mendoza_rectangulo(5.0, 5.0, "Rojo"); // Cuadrado

        // 2. Calcular áreas
        double areaCirculo1 = Math.PI * Math.pow(circulo1.getRadio(), 2);
        double areaCirculo2 = Math.PI * Math.pow(circulo2.getRadio(), 2);
        double areaRectangulo = rectangulo1.getLadoA() * rectangulo1.getLadoB();
        double areaCuadrado = cuadrado1.getLadoA() * cuadrado1.getLadoB();

        // 3. Comparaciones
        double diferenciaCirculos = Math.abs(areaCirculo1 - areaCirculo2);
        double diferenciaFiguras = Math.abs(areaCirculo1 - areaCuadrado);

        // 4. Mostrar resultados
        System.out.println("=== RESULTADOS ===");
        System.out.println("\nÁreas calculadas:");
        System.out.printf("- %s: %.2f%n", circulo1.getNombre(), areaCirculo1);
        System.out.printf("- %s: %.2f%n", circulo2.getNombre(), areaCirculo2);
        System.out.printf("- Rectángulo %s: %.2f%n", rectangulo1.getColor(), areaRectangulo);
        System.out.printf("- Cuadrado %s: %.2f%n", cuadrado1.getColor(), areaCuadrado);

        System.out.println("\nDiferencias:");
        System.out.printf("- Entre círculos: %.2f%n", diferenciaCirculos);
        System.out.printf("- Entre Círculo Solar y Cuadrado: %.2f%n", diferenciaFiguras);

        System.out.println("\nDetalles completos:");
        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println(rectangulo1);
        System.out.println(cuadrado1);
    }
}
