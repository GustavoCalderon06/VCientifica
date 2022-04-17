import java.util.Scanner;

public class SistemaEcuacionesLineales {

    double A,B,C,D,E,F;

    public SistemaEcuacionesLineales() {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escribe numero que acompaña a X en la primera ecuacion");
        this.A = teclado.nextDouble();
        System.out.println("Escribe numero que acompaña a Y en la primera ecuacion");
        this.B = teclado.nextDouble();
        System.out.println("Escribe resultado esperado en la primera ecuacion");
        this.C = teclado.nextDouble();
        System.out.println("Escribe numero que acompaña a X en la segunda ecuacion");
        this.D =teclado.nextDouble();
        System.out.println("Escribe numero que acompaña a Y en la segunda ecuacion");
        this.E = teclado.nextDouble();
        System.out.println("Escribe resultado esperado en la segunda ecuacion");
        this.F = teclado.nextDouble();
        CalculoX();
        CalculoY();
    }


    public void CalculoX(){
        double x;
        x=(C*E-B*F)/(A*E-B*D);
        System.out.println("El valor de x es= " + x);

    }
    public void CalculoY(){
        double y;
        y=(A*F-C*D)/(A*E-B*D);
        System.out.println("El valor de y es= " + y);

    }




}
