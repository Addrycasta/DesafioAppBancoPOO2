import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cliente = "Tony Stark";
        String cuenta = "Corriente";
        double saldoDisponible = 1599.99;

//        System.out.println("Nombre del cliente: " + cliente);
//        System.out.println("Tipo de cuenta: " + cuenta);
//        System.out.println("Saldo disponible : " + "$" + saldoDisponible ) ;

        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {

        System.out.println("**Escriba el numero de la opcion deseada**");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Retirar");
        System.out.println("3 - Depositar");
        System.out.println("9 - Salir");
        opcion = teclado.nextInt();



            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actualizado es:" + saldoDisponible);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad que desea retirar:");
                    double retiro = 0;
                    retiro = teclado.nextDouble();
                    if (retiro > saldoDisponible){
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldoDisponible -= retiro;
                        System.out.println("Saldo restante: $" + saldoDisponible);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad que desea depositar:");
                    double depositar = 0;
                    depositar = teclado.nextDouble();
                    double saldoActaulizado = saldoDisponible += depositar;
                    System.out.println("Saldo actualizado: " + "$" + saldoActaulizado);
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;

            }
        } while (opcion != 9);
        teclado.close();
    }
}