package operaciones;

public class Practica2 {
    
    public static void main(String[] args) {
        
        String nombre = "Fabiola Pichardo Ortega";
        
        int alturaEnteros = 45;
        int baseEnteros = 22;
        int areaEnteros = baseEnteros*alturaEnteros;
        
        double alturaDecimales = 4.5;
        double baseDecimales = 2.2;
        double areaDecimales = baseDecimales*alturaDecimales;
        
        System.out.println("Nombre completo: "+nombre);
        System.out.println("El area del rectangulo en enteros es "+areaEnteros+" cm cuadradoa");
        System.out.println("El area del rectangulo en decimales es "+areaDecimales+" cm cuadrados");        
    }
}
