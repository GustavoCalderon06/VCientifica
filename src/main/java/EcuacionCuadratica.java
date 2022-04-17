import java.util.*;

public class EcuacionCuadratica {

    public static void Datos() {
        double a = IngresarA();
        double b = IngresarB();
        double c = IngresarC();
        double delta = DeltaEcuacion(a, b, c);
        DependeDelta(a, b, c, delta);
    }

    public static double IngresarA() {
        System.out.println("Ingrese a:");
        System.out.print("a = ");
        Scanner teclado = new Scanner(System.in);
        double valora = teclado.nextDouble();
        return valora;
    }

    public static double IngresarB() {
        System.out.println("Ingrese b:");
        System.out.print("b = ");
        Scanner teclado = new Scanner(System.in);
        double valorb = teclado.nextDouble();
        return valorb;
    }

    public static double IngresarC() {
        System.out.println("Ingrese c:");
        System.out.print("c = ");
        Scanner teclado = new Scanner(System.in);
        double valorc = teclado.nextDouble();
        return valorc;
    }

    public static double DeltaEcuacion(double a, double b, double c) {

        return b * b - 4 * a * c;
    }


    public static void DependeDelta(double a, double b, double c, double delta) {
        if (delta > 0) {
            double solucion1 = (-b + Math.sqrt(delta)) / (2 * a);
            double solucion2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Hay dos números reales: x1= " + solucion1 + " x2= " + solucion2);

        } else if (delta == 0) {
            double solucion1 = -b / (2 * a);
            System.out.println("La ecuación tiene solo una raíz real, x1 = x2 =" + solucion1);

        } else if (delta < 0) {
            System.out.println("Ecuaciones sin raíces reales");
        }
    }
}
