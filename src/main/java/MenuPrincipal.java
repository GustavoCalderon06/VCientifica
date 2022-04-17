import java.util.*;

public class MenuPrincipal {
    public static void main(String[] args) {
        PrincipalMenu();
    }

    public static void PrincipalMenu(){
        Scanner ScanHD = new Scanner(System.in);
        boolean salir = false;
        int opcionPrincipal;
        System.out.println("Ingrese el numero de la opcion de desee");
        do {
            System.out.println("[1] Operaciones aritmeticas");
            System.out.println("[2] Ecuación cuadrática");
            System.out.println("[3] Figuras geométricas");
            System.out.println("[4] Sistema ecuaciones lineales");
            System.out.println("[5] Ecuación de la recta");
            System.out.println("[6] Salir");
            opcionPrincipal = ScanHD.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    OperadoresBásicos Operadores = new OperadoresBásicos();
                    Operadores.Menu();
                    System.out.println();

                    break;
                case 2:
                    EcuacionCuadratica Cuadratica = new EcuacionCuadratica();
                    Cuadratica.Datos();
                    System.out.println();

                    break;
                case 3:
                    FigurasGeometricas Figuras = new FigurasGeometricas();
                    System.out.println();

                    break;
                case 4:
                    SistemaEcuacionesLineales Lineales = new SistemaEcuacionesLineales();
                    System.out.println();

                    break;
                case 5:
                    EcuacionRecta Recta = new EcuacionRecta();
                    Recta.Central();
                    System.out.println();

                    break;
                case 6:
                    salir = true;

                    break;
                default:
                    System.out.println("Solo números entre 1 y 6");
            }
        }
        while (!salir);
    }









}


