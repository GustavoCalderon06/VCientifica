import java.util.Scanner;

public class FigurasGeometricas {

    public FigurasGeometricas() {
        ValidarMenu();
    }

    private static void PCuadrado(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        double lado=teclado.nextDouble();
        double perimetroC =lado*4;
        System.out.println("El perimetro es= " + perimetroC);
    }

    private static void ACuadrado(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        double lado=teclado.nextInt();
        double areaC=Math.pow(lado,lado);
        System.out.println("EL Area es= " + areaC);
    }

    public static void PRectangulo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el largo del rectamgulo:");
        double lado1=teclado.nextDouble();
        System.out.println("Ingrese el alto del rectamgulo:");
        double lado2=teclado.nextDouble();
        double perimetro=2*(lado2+lado1);
        System.out.println("El perimetro es = " + perimetro);
    }

    private static void ARectangulo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el largo del rectamgulo:");
        double lado1=teclado.nextDouble();
        System.out.println("Ingrese el alto del rectamgulo:");
        double lado2=teclado.nextDouble();
        double area=lado1*lado2;
        System.out.println("El area es = " + area);
    }

    private static void PCirculo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo:");
        double radio= teclado.nextDouble();
        double perimetro= 2*Math.PI*radio;
        System.out.println("El perimetro es = " + perimetro);

    }
    private static void ACirculo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo:");
        double radio= teclado.nextDouble();
        double area= Math.PI*Math.pow(radio,2);
        System.out.println("El area es = " + area);

    }


    private static void AEsfera(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera:");
        double radio= teclado.nextDouble();
        double area= (4*Math.PI*Math.pow(radio,2));
        System.out.println("El area es = " + area);


    }
    private static void VEsfera(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera:");
        double radio= teclado.nextDouble();
        double volumen= (4*Math.PI*Math.pow(radio,3))/3;
        System.out.println("El volumen es = " + volumen);

    }

    private static void ACubo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la longitud de cara del cubo:");
        double radio= teclado.nextDouble();
        double area= 6*(Math.pow(radio,2));
        System.out.println("El area es = " + area);



    }
    private static void VCubo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el radio del cubo:");
        double lado= teclado.nextDouble();
        double volumen= Math.pow(lado,3);
        System.out.println("El volumen es = " + volumen);

    }

    private static void ACono(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la altura del cono:");
        double h= teclado.nextDouble();
        System.out.println("Ingrese el radio del cono:");
        double r= teclado.nextDouble();
        double g=Math.sqrt(Math.pow(h,2)+Math.pow(r,2));
        double area=((Math.PI*r)*(r+g));
        System.out.println("El area es = " + area);
    }
    private static void VCono(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la altura del cono:");
        double h= teclado.nextDouble();
        System.out.println("Ingrese el radio del cono:");
        double r= teclado.nextDouble();
        double volumen=(Math.PI*Math.pow(r,2)*h)/3;
        System.out.println("El volumen es = " + volumen);
    }



    private static void MenuCuadrado(){
        TextoPyA();
        Scanner teclado = new Scanner(System.in);
        int operacion=teclado.nextInt();
        switch (operacion){
            case 1:
                PCuadrado();
                break;
            case 2:
                ACuadrado();
                break;
            default:
        }

    }
    private static void MenuRectangulo(){
        TextoPyA();
        Scanner teclado = new Scanner(System.in);
        int operacion=teclado.nextInt();
        switch (operacion){
            case 1:
                PRectangulo();
                break;
            case 2:
                ARectangulo();
                break;
            default:
        }

    }

    private static void MenuCirculo(){
        TextoPyA();
        Scanner teclado = new Scanner(System.in);
        int operacion=teclado.nextInt();
        switch (operacion){
            case 1:
                PCirculo();
                break;
            case 2:
                ACirculo();
                break;
            default:
        }

    }
    private static void MenuEsfera(){
        TextoAyV();
        Scanner teclado = new Scanner(System.in);
        int operacion=teclado.nextInt();
        switch (operacion){
            case 1:
                AEsfera();
                break;
            case 2:
                VEsfera();
                break;
            default:
        }

    }
    private static void MenuCubo(){
        TextoAyV();
        Scanner teclado = new Scanner(System.in);
        int operacion=teclado.nextInt();
        switch (operacion){
            case 1:
                ACubo();
                break;
            case 2:
                VCubo();
                break;
            default:
        }

    }
    private static void MenuCono(){
        TextoAyV();
        Scanner teclado = new Scanner(System.in);
        int operacion=teclado.nextInt();
        switch (operacion){
            case 1:
                ACono();
                break;
            case 2:
                VCono();
                break;
            default:
        }

    }
    private static void TextoPyA(){
        System.out.println("Seleccione lo que desea calcular:");
        System.out.println("[1]Perimetro");
        System.out.println("[2]Area");


    }
    private static void TextoAyV(){
        System.out.println("[1]Area");
        System.out.println("[2]Volumen");
    }
    private static void MenuPrincipal(){
        Scanner teclado= new Scanner(System.in);
        TextoMenuPrincipal();
        int operacion= teclado.nextInt();
        switch (operacion){
            case 1:
                MenuCuadrado();
                break;
            case 2:
                MenuRectangulo();
                break;
            case 3:
                MenuCirculo();
                break;
            case 4:
                MenuEsfera();
                break;
            case 5:
                MenuCubo();
                break;
            case 6:
                MenuCono();
                break;
            default:
        }


    }
    private static void TextoMenuPrincipal(){
        System.out.println("Elija una figura geometrica:");
        System.out.println("[1]Cuadrado");
        System.out.println("[2]Rectangulo:");
        System.out.println("[3]Circulo:");
        System.out.println("[4]Esfera:");
        System.out.println("[5]Cubo:");
        System.out.println("[6]Cono:");
    }
    public static void ValidarMenu(){
        int n = -1;
        do {
            MenuPrincipal();
            System.out.println("Quiere hacer otra operacion?\n1.-Si \n2.-No");
            n = Validar(2);
        } while (n == 1);

    }
    public static int Validar(int x) {
        int n = -1;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                n = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Error");
            }
            if (n < 0 || n > x) {
                System.out.println("ingrese un numero valido");
            }
        } while (n < 0 || n > x);
        return n;
    }






}
