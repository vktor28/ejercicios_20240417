import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    /*Una asociación benéfica te envía a pedir caridad. 
    Preguntas "una ayudita?", y si te dicen que sí, 
    preguntas cuánto quieren poner. Si te dicen que no,
    te deprimes y te vas para tu casa.

Al final, tienes que decir cuánta gente te ha ayudado y 
cuánto dinero has recaudado. */

Scanner teclado = new Scanner(System.in);
byte donacion;
byte donar;
int personas = 0;
int acumulador = 0;

do {
System.out.println("¿Quieres donar? (1=SI, 0=NO)");
donar = teclado.nextByte();
if(donar==1) {
System.out.println("Cuantos € quieres aportar para la asociación?");
donacion = teclado.nextByte();
personas=personas+1;
acumulador=acumulador+donacion;
}
}
while (donar == 1);


teclado.close();

    System.out.println("");
    System.out.println("Han donado  " + personas + " personas");
    System.out.println("En total hemos recaudado " + acumulador +"€");




    }
}


