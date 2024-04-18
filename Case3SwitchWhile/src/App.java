import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*3- SWITCH  - WHILE:

El archivo sonoro!

Usando una variable byte, preguntas cuál de los sonidos quieres escuchar. Cuando eligen un número, aparece la onomatopeya de ese sonido. Luego le preguntas: quieres escuchar otro? Y sigue hasta que diga no.

Ejemplo: elige 1- cohete, y suena ziuuum!, elige 3- moto, y suena brrrmmm!

Puedes probar la opción do...while para asegurar de que pregunta al menos una vez.

 */
        Scanner teclado = new Scanner(System.in);
        byte sonido; // solo se declara
        String pregunta="¿Cuál de los sonidos quieres escuchar?";

        do {
            
            System.out.println(pregunta);
            System.out.println("1- moto");
            System.out.println("2- gallo");
            System.out.println("3- perro");
            System.out.println("4- gato");

            sonido = teclado.nextByte();

            switch (sonido) {

                case 1:
                    System.out.println("brrrrmmm");
                    break;

                case 2:
                    System.out.println("chikirikiii");
                    break;

                case 3:
                    System.out.println("guaaauuu");
                    break;

                case 4:
                    System.out.println("miauuuu");
                    break;

                default:
                    System.out.println("no existe ningún sonido con ese número, elije uno del 1 a 4");
            }
            teclado.nextLine();
            System.out.println("¿Quieres escuchar otro? Y=1/N=0");
            
            byte otravez = teclado.nextByte();
            if(otravez==0){break;}
  
        } while (sonido != 0);

        teclado.close();

        System.out.println("");
        System.out.println("Hasta pronto");
        System.out.println("");



        }
    }

