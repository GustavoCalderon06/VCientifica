import java.util.*;

public class OperadoresBásicos {

    public static void Menu() {

        double variable1 = Valor1();
        double variable2 = Valor2();

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        System.out.println("Ingrese el numero de la opcion de desee");
        do {
            System.out.println("[1] Suma");
            System.out.println("[2] Resta");
            System.out.println("[3] Multiplicacion");
            System.out.println("[4] Division");
            System.out.println("[5] Mayor de ambos numeros");
            System.out.println("[6] Menor de ambos numeros");
            System.out.println("[7] Potencia de x1 elevado a x2");
            System.out.println("[8] % de x1");
            System.out.println("[9] % de x2");
            System.out.println("[10] Salir");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    Suma(variable1, variable2);
                    System.out.println();

                    break;
                case 2:
                    Resta(variable1, variable2);
                    System.out.println();

                    break;
                case 3:
                    Multiplicacion(variable1, variable2);
                    System.out.println();

                    break;
                case 4:
                    Division(variable1, variable2);
                    System.out.println();

                    break;
                case 5:
                    Mayor(variable1, variable2);
                    System.out.println();

                    break;
                case 6:
                    Menor(variable1, variable2);
                    System.out.println();

                    break;
                case 7:
                    Potencia(variable1, variable2);
                    System.out.println();

                    break;
                case 8:
                    PorcentajeX1(variable1);
                    System.out.println();

                    break;
                case 9:
                    PorcentajeX2(variable2);
                    System.out.println();

                    break;
                case 10:
                    salir = true;

                    break;
                default:
                    System.out.println("Solo números entre 1 y 10");
            }
        }
        while (!salir);
    }


    public static double Valor1() {
        System.out.println("Ingrese sus Primer dato:");
        System.out.print("x1 = ");
        Scanner teclado = new Scanner(System.in);
        double x1 = teclado.nextDouble();
        return x1;
    }

    public static double Valor2() {
        System.out.println("Ingrese su Segundo dato:");
        System.out.print("x2 = ");
        Scanner teclado2 = new Scanner(System.in);
        double x2 = teclado2.nextDouble();
        return x2;
    }

    public static double Suma(double variable1, double variable2) {
        double resultadoSuma = variable1 + variable2;
        System.out.println("El resultado de la suma de sus valores es: " + resultadoSuma);
        return resultadoSuma;
    }

    public static void Resta(double variable1, double variable2) {
        double resultadoResta = variable1 - variable2;
        System.out.println("El resultado de la resta de sus valores es: " + resultadoResta);
    }

    public static void Multiplicacion(double variable1, double variable2) {
        double resultadoMultiplicacion = variable1 * variable2;
        System.out.println("El resultado de la Multiplicacion de sus valores es: " + resultadoMultiplicacion);
    }

    public static void Division(double variable1, double variable2) {
        double resultadoDivision = variable1 / variable2;
        System.out.println("El resultado de la division de sus valores es: " + resultadoDivision);
    }

    public static void Mayor(double variable1, double variable2) {
        if (variable1 > variable2) {
            System.out.println(variable1 + " es Mayor que " + variable2);
        } else {
            System.out.println(variable2 + " es Mayor que " + variable1);
        }
    }

    public static void Menor(double variable1, double variable2) {
        if (variable1 < variable2) {
            System.out.println(variable1 + " es Menor que " + variable2);
        } else {
            System.out.println(variable2 + " es Menor que " + variable1);
        }
    }

    public static void Potencia(double variable1, double variable2) {
        double potencia1 = Math.pow(variable1, variable2);
        System.out.println("El resultado de la potencia de " + variable1 + " elevado a " + variable2 + " es: " + potencia1);
    }

    public static void PorcentajeX1(double variable1) {
        System.out.print("¿Qué % desea sacar de su primera variable?: ");
        Scanner porcentaje1a = new Scanner(System.in);
        double porcentaje1b = porcentaje1a.nextDouble();
        double porcentajeVariable1 = (porcentaje1b / 100) * variable1;
        System.out.println("El " + porcentaje1b + " de su variable " + variable1 + " es: " + porcentajeVariable1);
    }

    public static void PorcentajeX2(double variable2) {
        System.out.print("¿Qué % desea sacar de su segunda variable?: ");
        Scanner porcentaje2a = new Scanner(System.in);
        double porcentaje2b = porcentaje2a.nextDouble();
        double porcentajeVariable2 = (porcentaje2b / 100) * variable2;
        System.out.println("El " + porcentaje2b + " de su variable " + variable2 + " es: " + porcentajeVariable2);
    }
}
