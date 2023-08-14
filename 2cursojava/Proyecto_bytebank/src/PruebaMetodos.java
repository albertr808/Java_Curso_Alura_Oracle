import java.net.StandardSocketOptions;

public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1,23432);
        Cuenta cuenta2 = new Cuenta(1,43243);
        //metodo depositar
        cuenta1.depositar(200);
        System.out.println(cuenta1.getSaldo());
        //metodo retirar
        cuenta1.retirar(100);
        System.out.println(cuenta1.getSaldo());
        //metodo transferir
        System.out.println(cuenta2.getSaldo());
        cuenta1.transferir(250,cuenta2);
        System.out.println("segunda cuenta");
        System.out.println(cuenta2.getSaldo());
        System.out.println("primera cuenta");
        System.out.println(cuenta1.getSaldo());
    }
}
