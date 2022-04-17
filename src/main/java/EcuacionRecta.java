import java.util.*;

public class EcuacionRecta {

    public static double Xi() {
        System.out.println("Ingrese su Xi:");
        System.out.print("Xi = ");
        Scanner teclado = new Scanner(System.in);
        double xi = teclado.nextDouble();
        return xi;
    }

    public static double Yi() {
        System.out.println("Ingrese su Yi:");
        System.out.print("Yi = ");
        Scanner teclado = new Scanner(System.in);
        double yi = teclado.nextDouble();
        return yi;
    }

    public static double Xf() {
        System.out.println("Ingrese su Xf:");
        System.out.print("Xf = ");
        Scanner teclado = new Scanner(System.in);
        double xf = teclado.nextDouble();
        return xf;
    }

    public static double Yf() {
        System.out.println("Ingrese su Yf:");
        System.out.print("Yf = ");
        Scanner teclado = new Scanner(System.in);
        double Yf = teclado.nextDouble();
        return Yf;
    }

    public static void Central() {

        double x1 = Xi();
        double y1 = Yi();
        double x2 = Xf();
        double y2 = Yf();

        //diferencias
        double dx = x2 - x1;
        double dy = y2 - y1;

        MostrarPuntos(x1,y1,x2,y2);

        double M1 = m(dx, dy);
        double B1 = b(x1, y1, M1);

        MostrarSolucion(M1,B1);
    }

    public static double m(double dx, double dy) {
        System.out.println("M = " + dy / dx);
        return dy / dx;
    }

    public static double b(double x1, double y1, double M1) {
        double Mx1 = (M1 * x1);
        double B = y1 - Mx1;
        System.out.println("B = "+B);
        return B;
    }

    public static void MostrarPuntos(double x1, double y1, double x2, double y2){
        System.out.println("De acuerdo, Tus puntos en la recta son: (" + x1 + " , " + y1 + ") y (" + x2 + " , " + y2 + ")");
    }

    public static void MostrarSolucion(double B1,double M1){
        System.out.println("Su solucion del tipo Y=mX+b es:");
        System.out.println("Y = " + M1 + "X + " + B1);
        System.out.println("=================================================");
    }
}
