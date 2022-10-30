import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EcuasionCuadratica {
    public static void main(String[] args) {
        //Todo code aplication logic here
        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);
        double a,b,c; // valores de la ecuacion de 2° grado
        double X0 = 0,X1; // Psobles resultados

        System.out.println("Valor de a: ");
        a = sc.nextDouble();
        System.out.println("Valor de b; ");
        b = sc.nextDouble();
        System.out.println("Valor de c ");
        c = sc.nextDouble();

        double numero = (b*b) - (4*a*c);
        if(numero > 0)
            X0 = (-b + Math.sqrt(numero)) /2*a;
        System.out.println("La ecaucion tiene dos soluciones ");
            System.out.println("X0 = +X0 ");
            System.out.println("x1 = +X1 ");

            if (numero == 0 )
                X0 = (-b) / 2*a;
        System.out.println("La ecuacion tiene una solucion ");
        System.out.println("X0: " +X0);

        System.out.println("La ecuaision no tien solucio ");


    }
}
