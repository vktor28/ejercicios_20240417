import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    /*Preguntas estación del año. Mediante un switch,
    respondes una cosa u otra.
    Ejemplo "primavera". Respuesta: "la primavera me alteraaa".
 */
    Scanner teclado = new Scanner(System.in);
    System.out.println("¿En qué estación del año estamos?");
    System.out.println("1- Iniverno");
    System.out.println("2- Primavera");
    System.out.println("3- Verano");
    System.out.println("4- Otoño");
    byte estacion= teclado.nextByte();

    switch (estacion) {
        case 1:
            System.out.println("Me encanta el invierno");
            break;
        case 2:
            System.out.println("La primavera la sangre altera");
            break;
        case 3:
            System.out.println("Con ganas de que llegue");
            break;
        case 4:
            System.out.println("caen las hojas.");
            break;
    
        default:
        System.out.println("no inventes etaciones.");
            break;
    }

    }
}
